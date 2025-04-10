h, l, a, b = map(int, input().split())

# a면이 넓이이하이고, b를 접어서 높이이하인 경우 또는 a면을 접어서 높이 이하이고, b면이 넓이이하인 경우
if (a <= l and b/2 <= h) or (b <= l and a/2 <= h):
    print('YES')
else :
    print('NO')