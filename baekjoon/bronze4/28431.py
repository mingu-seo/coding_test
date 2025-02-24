socks = []

rest = ''
for _ in range(5) :
    n = input()
    if n in socks :
        socks.remove(n)
    else :
        socks.append(n)

print(socks[0])