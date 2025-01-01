n, d = map(int, input().split())
total = 0 # 총 문제수
arr = [] # 각 학생별 문제수
for _ in range(n) :
    a = int(input())
    arr.append(a)
    total += a
per_d = d // total # 문제당 상금

for a in arr :
    print(a * per_d)