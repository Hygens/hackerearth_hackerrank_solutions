from datetime import datetime
for _ in range(int(input())):
    s = datetime.strptime(input(), '%a %d %b %Y %H:%M:%S %z')
    t = datetime.strptime(input(), '%a %d %b %Y %H:%M:%S %z')
    print(abs(int((t-s).total_seconds())))