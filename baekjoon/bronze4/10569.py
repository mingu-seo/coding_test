# V : 꼭짓점개수, E : 모서리 개수
# V-E+X = 2
# X = 2 - V + E
T = int(input())
result = []
for _ in range(T):
    V, E = map(int, input().split())
    X = 2 - V + E
    result.append(X)

for r in result :
    print(r)