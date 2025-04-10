n, k, a, b = map(int, input().split())
# 엘리베이터 사용했을때, 걸어갔을때
yes = 0
no = 0

yes = (k-1) * b + (n-1) * b
no = (n-1) * a

print(yes, no)