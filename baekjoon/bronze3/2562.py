size = 9

max = 0
maxIdx = -1
for i in range(size):
    val = int(input())
    if val > max :
        max = val
        maxIdx = i

print(max)
print(maxIdx+1)