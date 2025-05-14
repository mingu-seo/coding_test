t1 = list(map(int, input().split()))
t2 = list(map(int, input().split()))

t1Score = t1[0] + t1[1]*2 + t1[2]*3
t2Score = t2[0] + t2[1]*2 + t2[2]*3

if t1Score > t2Score :
    print(1)
elif t1Score < t2Score :
    print(2)
else :
    print(0)