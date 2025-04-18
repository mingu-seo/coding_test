mo1 = ['a','e','i','o','u']
mo2 = ['a','e','i','o','u','y']

cnt1 = 0
cnt2 = 0
value = input()

for v in value :
    if v in mo1 :
        cnt1 += 1
    if v in mo2 :
        cnt2 += 1
print(cnt1, cnt2)