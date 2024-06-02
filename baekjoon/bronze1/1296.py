'''
팀 이름 정하기

'''

name = input()
N = int(input())

names = []
nameCount = []
for _ in range(N) :
    value = input()
    names.append(value)
    arr = []
    for n in 'LOVE' :
        arr.append(name.count(n) + value.count(n))
    
    total = 1
    for i in range(len(arr)) :
        for j in range(i+1, len(arr)) :
            total *= arr[i] + arr[j]

    nameCount.append(total % 100)

# print(names, nameCount)
maxIdx = 0
maxValue = -1
for i in range(len(nameCount)) :
    if maxValue < nameCount[i] :
        maxIdx = i
        maxValue = nameCount[i]
    elif maxValue == nameCount[i] :
        if names[maxIdx] > names[i] :
            maxIdx = i
            maxValue = nameCount[i]

print(names[maxIdx])
