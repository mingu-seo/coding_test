arr = []
import math

number = 1
while True :
    values = list(map(int, input().split()))
    if values[0] == 0 :
        break
    cnt = values[0]
    del values[0]
    mid = 0
    if len(values) % 2 == 0 :
        idx = int(len(values)/2)
        mid = float(values[idx-1] + values[idx]) / 2
    else :
        mid = float(values[int(len(values) / 2)])
    arr.append(mid)

for i, a in enumerate(arr) :
    print('Case {}: {}'.format(i+1, a))