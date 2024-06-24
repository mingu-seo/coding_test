l1 = []
l2 = []

for v in map(int ,input().split()) :
    l1.append(v)
for v in map(int ,input().split()) :
    l2.append(v)
# print(l1)
# print(l2)

s1 = l1[0] * 3 + l1[1] * 20 + l1[2] * 120
s2 = l2[0] * 3 + l2[1] * 20 + l2[2] * 120

if s1 > s2 :
    print('Max')
elif s1 < s2 :
    print('Mel')
else :
    print('Draw')