'''
주사위 게임

'''
n = int(input())

result = [100,100]
for i in range(n) :
    a, b = tuple(map(int ,input().split()))
    if a > b :
        result[1] -= a
    elif a < b :
        result[0] -= b
print(result[0])
print(result[1])