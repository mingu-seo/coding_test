arr = []

while True :
    B, N = map(int, input().split())
    if B == 0 and N == 0 :
        break
    A = 1
    A0 = 0
    A1 = 0
    while True :
        if A ** N > B :
            A0 = (A-1) ** N
            A1 = A ** N
            if abs(B-A0) <= abs(B-A1) :
                arr.append(A-1)
            else :
                arr.append(A)
            break
        A += 1

# print(arr)
for a in arr :
    print(a)