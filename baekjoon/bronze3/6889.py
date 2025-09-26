n = int(input())
m = int(input())

text1 = []
text2 = []

result = []

for _ in range(n) :
    text1.append(input())
for _ in range(m) :
    text2.append(input())
print(text1)
print(text2)
for i in range(len(text1)) :
    for j in range(len(text2)) :
        print('{} as {}'.format(text1[i], text2[j]))