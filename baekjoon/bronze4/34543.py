N = int(input())
W = int(input())

result = N * 10
if N >= 3 : result += 20
if N == 5 : result += 50
if W > 1000 : result -= 15
if result < 0 : result = 0

print(result)