N = int(input())

a = 0
b = 0

cnt = 0
while True :
    if a*b >= N :
        break
    if cnt % 2 == 0 :
        a += 1
    else :
        b += 1
    cnt += 1
print(a, b)