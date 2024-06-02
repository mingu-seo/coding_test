value = input().split()
x = int(value[0])
y = int(value[1])
w = int(value[2])
h = int(value[3])

x_dis = min(w - x, x - 0)
y_dis = min(h - y, y - 0)

print(min(x_dis, y_dis))