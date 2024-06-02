'''
배열로 입력받아 저장
정렬할때 
'''

import sys

N = int(sys.stdin.readline())
arr = []
for i in range(N):
    values = sys.stdin.readline().split()
    arr.append([i, int(values[0]), values[1]])

#arr = sorted(arr, key=lambda v : (v[1], v[0]))
arr.sort(key=lambda v : (v[1], v[0]))

for a in arr :
    print(a[1], a[2])