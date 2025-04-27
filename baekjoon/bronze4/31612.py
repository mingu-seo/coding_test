N = int(input())
S = input()

result = 0
for c in S :
    if c == 'j' or c == 'i' :
        result += 2
    else :
        result += 1
print(result)