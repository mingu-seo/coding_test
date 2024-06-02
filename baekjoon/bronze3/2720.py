size = int(input())

values = []
for i in range(size):
    value = int(input())
    q = value // 25
    d = value % 25 // 10
    n = value % 25 % 10 // 5
    p = value % 25 % 10 % 5 // 1
    values.append('{} {} {} {}'.format(q, d, n, p))

for v in values:
    print(v)