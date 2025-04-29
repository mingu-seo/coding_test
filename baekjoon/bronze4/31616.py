N = int(input())
S = input()

s = S[0]
result = 'Yes'
for i in range(1, N) :
    if s != S[i] :
        result = 'No'
        break
print(result)