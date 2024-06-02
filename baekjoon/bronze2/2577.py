'''
숫자의 개수
'''
A = int(input())
B = int(input())
C = int(input())

total = A * B * C

arr = []
totals = str(total)
for i in range(10):
    cnt = totals.count(str(i))
    arr.append(cnt)

for a in arr :
    print(a)