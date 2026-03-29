T = int(input())
result = []

for i in range(T) :
    H, M = map(int, input().split())
    if M-45 < 0 :
        H = H-1
        M = M+60 - 45
    else :
        M = M - 45
    if H < 0 :
        H = 23
    result.append('Case #{}: {} {}'.format(i+1, H, M))

for r in result :
    print(r)