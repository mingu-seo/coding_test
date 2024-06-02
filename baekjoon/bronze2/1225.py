'''
이상한 곱셈
'''

n1, n2 = tuple(input().split())

result = 0
sum_i = 0
for i in n2 :
    sum_i += int(i)
for j in n1:
    result += sum_i * int(j)
print(result)