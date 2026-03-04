n = int(input())
b1, b2 = map(int, input().split())

result = []
for _ in range(n) :
    lx, ly, hx, hy = map(int, input().split())
    if b1 >= lx and b1 <= hx and b2 >= ly and b2 <= hy :
        result.append('Yes')
    else :
        result.append('No')

# print(result)
if 'Yes' in result :
    print('Yes')
else :
    print('No')