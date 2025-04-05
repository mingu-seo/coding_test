arr1 = []

while True :
    N = int(input())
    if N == 0 :
        break
    else :
        arr2 = []
        for _ in range(N) :
            v = int(input())
            arr2.append(v)
        arr2.reverse()
        arr2.append(0)
        arr1.append(arr2)
# print(arr1)
for a1 in arr1 :
    for a in a1:
        print(a)
        