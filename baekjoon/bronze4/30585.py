h, w = map(int, input().split())
zero = 0
one = 0

for _ in range(h) :
    line = input()
    zero += line.count('0')
    one += line.count('1')
print(min(zero, one))