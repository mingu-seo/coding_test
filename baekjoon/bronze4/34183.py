N, M, A, B = map(int, input().split())

chair = N*3
if chair <= M :
    print(0)
else :
    print((chair - M) * A + B)