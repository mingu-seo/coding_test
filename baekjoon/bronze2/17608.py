'''
막대기

스택구조처럼 마지막값을 기준으로 뒤에서부터 하나씩 비교, 그중 비교값보다 크면 비교값 교체
시간초과는 sys.stdin.readline()으로
'''
import sys
N = int(sys.stdin.readline())

arr = []
for i in range(N) :
    v = int(sys.stdin.readline())
    arr.append(v)

result = 1
last = arr[-1]
for i in range(len(arr)-2, -1, -1) :
    if last < arr[i] : 
        result += 1
        last = arr[i]
print(result)