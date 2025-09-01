# 짝수면 0, 홀수면 1
n = int(input())
result = []

for _ in range(n) :
    v, b = map(int, input().split())

    value = ''
    while True :
        value = str(v % 2) + value
        v = v // 2
        if v == 0 : break
    if value.count('1') % 2 == b :
        result.append('Valid')
    else :
        result.append('Corrupt')

for r in result :
    print(r)