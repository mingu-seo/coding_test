'''
Can you add this?
'''
N = int(input())
result = []
for _ in range(N) :
    r = list(map(int, input().split()))
    result.append(sum(r))
for r in result :
    print(r)