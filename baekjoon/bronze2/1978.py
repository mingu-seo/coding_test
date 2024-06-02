size = int(input())
value = input().split()

result = 0
for i in range(size):
    isPrime = True
    for j in range(2, int(value[i])//2+1):
        # print(value[i], j)
        if j > 1 and int(value[i]) % j == 0 :
            isPrime = False
            break
        isPrime = True
    if int(value[i]) > 1 and isPrime : result += 1
print(result)