x = 10
y = 40
n = 5


dp = [float('inf')] * (y + 1)
dp[x] = 0
print(len(dp))
for i in range(x, y + 1):
    if dp[i] == float('inf'):
        continue
    print(dp)
    if i + n <= y:
        dp[i + n] = min(dp[i + n], dp[i] + 1)
        print(dp)

    if i * 2 <= y:
        dp[i * 2] = min(dp[i * 2], dp[i] + 1)

    if i * 3 <= y:
        dp[i * 3] = min(dp[i * 3], dp[i] + 1)
    print(dp)

print(dp)
print(min(float('-inf'), 0))
print()