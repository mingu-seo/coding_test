a = input()
b = input()

x = abs(ord(a[0]) - ord(b[0]))
y = abs(int(a[1]) - int(b[1]))


print(min(x, y), max(x, y))