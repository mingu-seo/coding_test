A, B = map(int, input().split())
C, D = map(int, input().split())

cnt = A+B+C+D - 2

result = 1
for _ in range(cnt) :
    result += 1
    if result == 5 : result = 1
print(result)