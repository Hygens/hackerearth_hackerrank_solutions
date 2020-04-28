import re
from sys import stdin,stdout
def vowels(string):
    cnt = re.findall('[aeiou]', string, re.IGNORECASE)
    return len(cnt)

t = int(stdin.readline().strip())
for _ in range(t):
    stdout.write(str(vowels(stdin.readline().strip()))+'\n')
