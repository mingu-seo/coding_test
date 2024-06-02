size = int(input())
val = input().split(' ')
val = [int(i) for i in val]

val.sort(reverse=True)
val2 = [v/val[0]*100 for v in val]
total = 0
for v in val2:
    total += v
print(total / size)