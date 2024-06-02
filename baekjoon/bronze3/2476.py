'''
주사위 게임

'''
N = int(input())

result = 0
for i in range(N) :
    n = list(map(int, input().split()))
    equal_count = 0
    max_value = 0
    
    if n[0] == n[1] and n[0] == n[2] :
        price = n[0] * 1000 + 10000
    elif n[0] == n[1] or n[0] == n[2]:
        price = n[0] * 100 + 1000
    elif n[1] == n[2]:
        price = n[1] * 100 + 1000
    else :
        price = max(n) * 100
    # print(price)
    if result < price : result = price

print(result)