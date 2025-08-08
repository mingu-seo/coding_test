arr = list(map(int, input().split()))
value = input()

arr.sort()
result = {'A':arr[0], 'B':arr[1], 'C':arr[2]}
print(result[value[0]], result[value[1]], result[value[2]])