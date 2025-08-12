N = int(input())

arr = []
for _ in range(N) :
    v = int(input())
    arr.append(v)

min_value = arr[0]
max_value = arr[0]
min_idx = 0
max_idx = 0

for i in range(1, len(arr)) :
    if min_value > arr[i] :
        min_value = arr[i]
        min_idx = i
    if max_value < arr[i] :
        max_value = arr[i]
        max_idx = i
# print(min_value, min_idx)
if min_idx == 0 :
    print('ez')
elif max_idx == 0 :
    print('hard')
else :
    print('?')