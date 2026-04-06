T = int(input())
result = []

for i in range(T) :
    N, M = map(int, input().split())
    result.append('Case {}: {}'.format(i+1, M - (N-1)))

for r in result :
    print(r)