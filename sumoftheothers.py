n = int(input().strip())
for _ in range(n):
    s = input() ; print(' '.join(s.split(' ')[2:])) if s.startswith('simon says') else print('')
