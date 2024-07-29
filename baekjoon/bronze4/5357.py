arr = []
N = int(input())

for _ in range(N) :
    s = input()
    a = ''
    for i, c in enumerate(s):
        if i == 0 :
            a += c
        else :
            if s[i-1] != c :
                a += c
    arr.append(a)

for a in arr :
    print(a)