
n = int(input())

def reverse(s) :
    r = ''
    for i in range(len(s)-1, -1, -1) :
        r += s[i]
    return r

result = []
for _ in range(n) :
    a, b = input().split()
    a = reverse(a)
    b = reverse(b)

    c = int(a) + int(b)
    c = int(reverse(str(c)))
    result.append(c)

for r in result :
    print(r)