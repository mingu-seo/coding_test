NM = [int(i) for i in input().split()]
nList = set()
mList = set()

for i in range(NM[0]):
    nList.add(input())
for i in range(NM[1]):
    mList.add(input())

result = []
short = set()
long = set()

if len(nList) >= len(mList) :
    short = mList
    long = nList
else :
    short = nList
    long = mList

for word in short :
    if word in long :
        result.append(word)

result.sort()
print(len(result))
for r in result :
    print(r)