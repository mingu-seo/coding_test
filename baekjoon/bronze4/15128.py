p1, q1, p2, q2 = map(int, input().split())

# 부동소수점 오류로
# (p1 / q1) * (p2 / q2) / 2 이 계산 오류남

if (p1 * p2 / q1 / q2 / 2) == int(p1 * p2 / q1 / q2 / 2) :
    print(1)
else :
    print(0)