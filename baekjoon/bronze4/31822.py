code = input()
N = int(input())
result = 0
for i in range(N) :
    v = input()
    if code[0:5] == v[0:5] :
        result += 1
print(result)