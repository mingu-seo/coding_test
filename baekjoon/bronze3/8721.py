import sys
input = sys.stdin.readline

n = int(input())
numbers = list(map(int, input().split()))

target = 1
for x in numbers:
    if x == target:
        target += 1

print(n - (target - 1))
