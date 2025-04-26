N = int(input())

S = input()
T = input()

result = 0

for i, c in enumerate(S) :
    if S[i] != T[i] :
        result += 1

print(result)