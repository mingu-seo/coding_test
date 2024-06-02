'''
이진수 덧셈

'''
v1, v2 = tuple(input().split())

v1_1 = 0
for i in range(len(v1)-1, -1, -1) :
    if v1[i] == '1' : v1_1 += 2 ** ((len(v1)-1)-int(i))
# print(v1_1)

v2_1 = 0
for i in range(len(v2)-1, -1, -1) :
    if v2[i] == '1' : v2_1 += 2 ** ((len(v2)-1)-int(i))
# print(v2_1)
result = v1_1 + v2_1

if result == 0 : # 결과값이 0인경우 0출력하고 종료
    print(0)
    exit(0)
# print(result)
answer = ''

while result >= 2 :
    answer = str(result % 2) + answer
    result = result // 2
if result == 1 : answer = str(result) + answer
print(answer)