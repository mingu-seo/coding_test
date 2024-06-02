'''
완전탐색이므로 1부터 N번째까지 전체 탐색
666부터 시작해서 666이 포함되어
'''

N = int(input())

val = 666
cnt = 1
while cnt < N  :
    val += 1
    if '666' in str(val):
        cnt += 1
    
print(val)