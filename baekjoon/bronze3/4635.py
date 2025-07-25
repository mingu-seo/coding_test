arr = []

while True :
    N = int(input())
    if N == -1 :
        break
    
    prev_hour = 0
    total = 0
    for _ in range(N) :
        mile, hour = map(int, input().split())
        total += mile * (hour - prev_hour)
        prev_hour = hour
    arr.append(total)

for a in arr :
    print(a, 'miles')