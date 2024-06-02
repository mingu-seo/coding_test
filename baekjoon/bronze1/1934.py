'''
최소공배수를 구하는 로직만으로는 시간초과 발생

'''

T = int(input())

arr = []
for i in range(T):
    n1, n2 = (int(i) for i in input().split())
    m = min(n1, n2)
    result = 0
    for i in range(m, 0, -1) :
        if n1 % i == 0 and n2 % i == 0 :
            result = i
            break
    arr.append(n1 * n2 // result)

for a in arr :
    print(a)