T = int(input())

result = []
for _ in range(T) :
    arr = input().split()
    if arr[1] == 'kg' :
        result.append('{:.4f} lb'.format(float(arr[0]) * 2.2046))
    elif arr[1] == 'l' :
        result.append('{:.4f} g'.format(float(arr[0]) * 0.2642))
    elif arr[1] == 'lb' :
        result.append('{:.4f} kg'.format(float(arr[0]) * 0.4536))
    elif arr[1] == 'g' :
        result.append('{:.4f} l'.format(float(arr[0]) * 3.7854))

for r in result :
    print(r)