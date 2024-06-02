'''
시간제한으로
입력받는부분도 input() 대신 sys.stdin.readline()
출력도 print() 대신 sys.stdout.write()
정렬하지 않고 배열 미리 만들어놓고 해당 인덱스로 처리
'''

import sys
N = int(sys.stdin.readline())

arr = [0 for i in range(10001)]
for i in range(N):
    inputValue = int(sys.stdin.readline())
    arr[inputValue-1] += 1

for i in range(len(arr)):
    if arr[i] != 0 :
        for j in range(arr[i]):
            sys.stdout.write(str(i+1)+'\n')

