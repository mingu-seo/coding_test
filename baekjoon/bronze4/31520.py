n = input()

v = 0

for c in n :
    v += 1
    # print(c, v)
    if int(c) != v :
        v = -1
        break
print(v)