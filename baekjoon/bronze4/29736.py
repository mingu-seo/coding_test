A, B = map(int, input().split())
K, X = map(int, input().split())

s = K-X
e = K+X

result = 0
for i in range(A, B+1) :
    if i >= s and i <= e : result += 1

if result == 0 : result = 'IMPOSSIBLE'
print(result)