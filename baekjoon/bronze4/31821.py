N = int(input())
menu = []
for _ in range(N) :
    menu.append(int(input()))

M = int(input())
result = []
for _ in range(M) :
    result.append(menu[int(input())-1])

print(sum(result))