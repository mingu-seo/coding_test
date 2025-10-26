N, K = map(int, input().split())
arr = list(map(int, input().split()))

result = []
for a in arr :
    # N에 가까운지 1에 가까운지
    if N-a < a-1 :
        result.append(N)
    else :
        result.append(1)

for r in result :
    print(r)