values = [int(i) for i in input().split()]

S = []
for i in range(values[0]):
    S.append(input())

result = 0
for i in range(values[1]):
    v = input()
    if v in S :
        result += 1

print(result)