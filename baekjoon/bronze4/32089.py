result = []

while True :
    n = int(input())
    if n == 0 :
        break
    else :
        arr = list(map(int, input().split()))
        m = 0

        for i in range(0, len(arr)-2) :
            t = arr[i] + arr[i+1] + arr[i+2]
            if m < t : m = t
        result.append(m)

for r in result :
    print(r)