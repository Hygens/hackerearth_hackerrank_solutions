from Crypto.Util.number import isPrime
  
if __name__ == '__main__':
    from math import sqrt
    total_test_cases = int(input())
    for t in range(total_test_cases):
        count = 0
        test_prime = int(input())
        if isPrime(test_prime):
            count = 1
        else:
            count = 0
        for num in range(test_prime, 10**6):
            result = isPrime(num)
            if result:
                count += 1
        print(count)