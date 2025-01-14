N, M = map(int, input().split())

# 1 * 1 = 0
# 1 * 2 = 1
# 2 * 1 = 1
# 2 * 2 = 2
# 3 * 1 = 2
# 1 * 3 = 2

print(N * M // 2)