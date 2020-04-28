a=long(raw_input(),2)
b=long(raw_input(),2)
m=10**9+7
r=0
for i in range(314160):
    r+=a^(b<<i)
print(r%m)