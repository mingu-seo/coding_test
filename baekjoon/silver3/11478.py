'''
문자열

0:0
0:1
0:2
0:3
0:4
0:5

'''
value = input()

result = set() # 세트로 안하고 리스트로하면 시간초과
e = ''

for i in range(1, len(value)+1) :
    for j in range(0, len(value) - i+1) :
        # print(i,j,i+j)
        e = value[j:i+j]
        result.add(e)

# print(result)
print(len(result))