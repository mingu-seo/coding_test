A1 = int(input())
A2 = int(input())
A3 = int(input())

maxValue = 0

# 1층인 경우
value1 = A2*2 + A3*4
# 2층인 경우
value2 = A1*2 + A3*2
# 3층인 경우
value3 = A1*4 + A2*2

print(min(value1, value2, value3))