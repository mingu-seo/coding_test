T, X = map(int, input().split())
N = int(input())

result = 'YES'
for _ in range(N) :
    K = int(input())
    A = list(map(int, input().split()))
    if result == 'YES' and X not in A :
        result = 'NO'
        
print(result)