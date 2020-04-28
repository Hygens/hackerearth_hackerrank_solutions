s = input().strip().lower()
while s:
    try:
        print('yes' if 'problem' in s else 'no')
        s = input().strip().lower()
    except (EOFError):
        break