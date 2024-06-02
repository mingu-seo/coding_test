values = []
for i in range(5):
    values.append(int(input()))
values.sort()
print(sum(values)//5)
print(values[2])