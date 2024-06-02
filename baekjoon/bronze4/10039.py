'''
평균점수
'''
arr = []
for i in range(5) :
    v = int(input())
    if v < 40 : v = 40
    arr.append(v)
print(sum(arr) // 5)