N = int(input())
numbers = input().split()
get_card = {}
for i in range(N):
    get_card[numbers[i]] = 1
M = int(input())
numbers = input().split()
result = []
for i in range(M):
    if get_card.get(numbers[i]) :
        result.append(1)
    else :
        result.append(0)

for r in result :
    print(r, end=' ')