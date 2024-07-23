x, y = map(int, input().split())

a = int((x+y)/2)
b = int((x-y)/2)
# 조건 중 y > x 누락
if y > x or x < 0 or y < 0 or a+b != x or abs(a-b) != y:
    print(-1)
else :
    print(a, b)