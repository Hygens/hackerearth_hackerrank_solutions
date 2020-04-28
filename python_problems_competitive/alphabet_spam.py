from collections import Counter
import string

def count_lower_letters(word, valid_letters=string.ascii_lowercase):
    count = Counter(word) 
    return sum(count[letter] for letter in valid_letters)

def count_upper_letters(word, valid_letters=string.ascii_uppercase):
    count = Counter(word) 
    return sum(count[letter] for letter in valid_letters)

def count_punctuation(word, valid_letters=string.punctuation+string.digits):
    count = Counter(word) 
    return sum(count[letter] for letter in valid_letters)

s = input().strip().replace('_',' ')
size_s = len(s)
nspaces = s.count(' ')
nlowers = count_lower_letters(s)
nuppers = count_upper_letters(s)
npuncts = count_punctuation(s)
print('%.6f' %(nspaces/size_s))
print('%.6f' %(nlowers/size_s))
print('%.6f' %(nuppers/size_s))
print('%.6f' %(npuncts/size_s))



   
    