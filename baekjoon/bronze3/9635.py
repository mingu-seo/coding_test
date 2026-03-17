T = int(input())
result = []

for _ in range(T) :
    N, X, Y = map(int, input().split())
    numbers = list(map(int, input().split()))
    if X == numbers[0] and Y == numbers[-1] :
        result.append('BOTH')
    elif X == numbers[0] :
        result.append('EASY')
    elif Y == numbers[-1] :
        result.append('HARD')
    else :
        result.append('OKAY')

for r in result :
    print(r)