def is_kaprekar_number(n):
    if n < 1:
        return False
    elif n == 1:
        return True
    else:
        s = str(n**2)
        a = int(s[: -len(str(n))]) if len(s) > 1 else 0
        b = int(s[-len(str(n)) :])
        
        return b > 0 and a + b == n
p = int(raw_input())
q = int(raw_input())    
kaprekars = [n for n in range(p, q + 1) if is_kaprekar_number(n)]
print(' '.join(map(str, kaprekars)) if kaprekars else 'INVALID RANGE')