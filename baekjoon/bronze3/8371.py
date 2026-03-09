n = int(input())
text1 = input()
text2 = input()
result = 0

for i in range(n) :
    if text1[i] != text2[i] :
        result += 1
print(result)