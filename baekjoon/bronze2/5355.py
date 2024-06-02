'''
화성 수학
'''

T = int(input())

result = []
for _ in range(T):
    arr = input().split()
    v = float(arr[0])
    for i in range(1, len(arr)) :
        if arr[i] == '@' : v *= 3
        elif arr[i] == '%' : v += 5
        elif arr[i] == '#' : v -= 7
    result.append(v)

for r in result :
    print(format(r, '.2f'))