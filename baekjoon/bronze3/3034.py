import math

N, W, H = map(int, input().split())
result = []
compare_value = math.sqrt(W**2 + H**2)
for _ in range(N) :
    v = int(input())
    if v <= compare_value :
        result.append('DA')
    else :
        result.append('NE')

for r in result :
    print(r)