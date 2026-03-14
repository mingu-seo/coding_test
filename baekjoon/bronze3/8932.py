T = int(input())
result = []

for _ in range(T):
    a, b, c, d, e, f, g = map(int, input().split())
    t = int(9.23076 * (26.7-a)**1.835)
    t += int(1.84523 * (b - 75)**1.348)
    t += int(56.0211 * (c - 1.5)**1.05)
    t += int(4.99087 * (42.5 - d) ** 1.81)
    t += int(0.188807 * (e - 210) ** 1.41)
    t += int(15.9803 * (f - 3.8) ** 1.04)
    t += int(0.11193 * (254 - g) ** 1.88)

    result.append(t)

for r in result :
    print(r)

