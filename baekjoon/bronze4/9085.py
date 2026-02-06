T = int(input())
result = []

for _ in range(T) :
    N = int(input())
    values = map(int, input().split())
    result.append(sum(values))

for r in result :
    print(r)