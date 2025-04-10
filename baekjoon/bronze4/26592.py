n = int(input())

arr = []
for _ in range(n) :
    a, b = map(float, input().split())
    v = a*2/b
    arr.append(v)

for a in arr :
    print('The height of the triangle is {:.2f} units'.format(a))