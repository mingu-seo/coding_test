value = input().split()
n1 = int(value[0])
n2 = int(value[1])

result = 0
answer = 0
for i in range(1, n1+1):
    if n1 % i == 0 :
        result += 1
    if result == n2 :
        answer = i
        break
print(answer)