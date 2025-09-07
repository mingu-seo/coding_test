result = []

while True :
    A, B = map(int, input().split())
    if A==0 and B==0 : break
    C = B * -1
    while True :
        
        avg = (A+B+C) / 3
        arr = [A,B,C]
        arr.sort()
        median = arr[1]
        # print(avg, median)
        if avg == median :
            result.append(C)
            break
        C = C+A

for r in result :
    print(r)