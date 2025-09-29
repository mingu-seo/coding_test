# n = int(input())
import sys
n = int(sys.stdin.readline())
result = [0, 0]

for _ in range(n) :
    a, b = map(int, sys.stdin.readline().split())
    if a > b : result[0] += 1
    elif a < b : result[1] += 1

print(result[0], result[1])