N = input()

start = int(N) - sum([int(9) for i in N])
end = int(N)
result = 0
for i in range(start, end):
    v = ''
    values = []
    for c in str(i):
        if c == '-' : continue # 아니 문제에는 1< 이상인데 왜?
        v += c
        values.append(int(c))
    # print(v, sum(values)+int(v))
    if int(N) == sum(values) + int(v):
        result = v
        break
print(result)