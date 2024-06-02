'''
1 -> 7 ->  19 -> 37 -> 61
1 +  6 +   12 +  18 +  24
'''
value = int(input())
result = 1
i = 0
cnt = 1
while True:
    result = result + i
    if result >= value:
        break
    i += 6
    
    cnt += 1
    
print(cnt)