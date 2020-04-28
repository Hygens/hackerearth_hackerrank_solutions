from collections import defaultdict
from Crypto.Util.number import isPrime as is_prime
from sys import stdin,stdout
def precompute_d(max_digits=18):   
    d = {}   
    d[0] = {0: {0: 1}}
    digits_and_squares = [(i, i ** 2) for i in range(10)]
    for nr_digits in range(1, max_digits + 1):
        d_curr = defaultdict(lambda: defaultdict(int))
        for ds, tempdict in d[nr_digits - 1].items():
            for sds, count in tempdict.items():
                for digit, squared_digit in digits_and_squares:
                    d_curr[ds + digit][sds + squared_digit] += count
        d[nr_digits] = d_curr
    return d
class exec_sol(object):
    def __init__(self):
        self.d = precompute_d()        
        self.primes = [is_prime(p) for p in range(2000)]
        self.cache = {}
    def query(self, a, b):
        return self._query(b) - self._query(a-1)
    def _count_matches(self, digits, prefix_sum, prefix_squared_sum):
        key = (digits, prefix_sum, prefix_squared_sum)
        if key in self.cache:
            return self.cache[key]
        result = 0
        for ds, tempdict in self.d[digits].items():
            if self.primes[ds + prefix_sum]:
                for sds, count in tempdict.items():
                    if self.primes[sds + prefix_squared_sum]:
                        result += count
        self.cache[key] = result
        return result
    def _query(self, x):
        result = 0
        digits = [int(d) for d in str(x)]
        prefix_sum = 0
        prefix_squared_sum = 0
        for idx, digit in enumerate(digits):
            remaining_digits = len(digits) - idx - 1            
            for i in range(0, digit):
                result += self._count_matches(
                    remaining_digits,
                    prefix_sum + i,
                    prefix_squared_sum + i * i)

            prefix_sum += digit
            prefix_squared_sum += digit * digit
        if self.primes[prefix_sum] and self.primes[prefix_squared_sum]:
            result += 1
        return result

execs = exec_sol()
t = int(stdin.readline().strip())
for i in range(t):
    a, b = map(int, stdin.readline().split())
    stdout.write(str(execs.query(a, b))+'\n')
    
    