total = 0

for i in range(4):
    total += int(input())

m = total // 60
s = total % 60
print(m)
print(s)