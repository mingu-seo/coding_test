N = int(input())
r = -1
for _ in range(N) :
    A, B = map(int, input().split())
    if A <= B :
        if r == -1 :
            r = B
        else :
            if r > B :
                r = B
print(r)