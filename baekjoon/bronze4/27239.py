n = int(input())

x = n % 8
y = n // 8
if x == 0 : x = 8
if n % 8 > 0 : y += 1
print(chr(96+x) + str(y))