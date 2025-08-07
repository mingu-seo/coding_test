N = int(input())

if N == 1 :
    print(2)
elif N % 2 == 1 :
    print(((N//2+2) * (N//2+1)))
else :
    # 짝수일땐 비교해서 큰값으로
    v1 = (N//2+1) * (N//2+1)
    v2 = (N//2+2) * (N//2)
    print(max(v1, v2))