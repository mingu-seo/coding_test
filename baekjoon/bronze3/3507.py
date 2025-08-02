n = int(input())

result = 0
for i in range(100) :
    for j in range(100) :
        if i + j == n :
            result += 1
print(result)