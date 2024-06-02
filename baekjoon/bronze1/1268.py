'''
임시 반장 정하기
'''
N = int(input())

datas = [[] for _ in range(5)]
for _ in range(N) :
    line = list(map(int, input().split()))
    for i, l in enumerate(line) :
        datas[i].append(l)
# print(datas)

student = {}
for data in datas :
    for i, d in enumerate(data) :
        friend = set()
        for j, d2 in enumerate(data) :
            if i != j :
                if d == d2 : friend.add(j+1)
        if student.get(i+1) :
            student[i+1] = student.get(i+1).union(friend)
        else :
            student[i+1] = friend
        # student[i] = student[i] + data.count(d)
# print(student)
maxIdx = -1
maxStudent = 0
for k, v in student.items() :
    if maxStudent < len(v) :
        maxStudent = len(v)
        maxIdx = k
if maxIdx == -1 : 
    print(1)
    exit(0)
print(maxIdx)