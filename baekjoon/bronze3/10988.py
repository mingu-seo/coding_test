a = input()

result = 1
for i in range(len(a)//2):
    # print(a[i], a[len(a)-(1+i)])
    if a[i] != a[len(a)-(1+i)] :
        result = 0
        break
print(result)