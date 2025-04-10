n = int(input())

arr = []
for _ in range(n) :
    v = input()
    if v[-1] != '.' :
        v += '.'
    arr.append(v)
for a in arr :
    print(a)