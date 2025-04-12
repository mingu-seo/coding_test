N, M = map(int, input().split())

result = 0
for _ in range(N) :
    line = input()
    if line.count('O') > M / 2 :
        result += 1
print(result)