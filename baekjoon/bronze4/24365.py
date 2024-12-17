A, B, C = map(int, input().split())

d = (A+B+C) // 3 # 세값 평균값

t = 0
m = 0 # 이동한 거리
# C가 가장 크므로 뒤에서부터 비교
if C - d > 0 : # C랑 평균값과의 차이가 있으면
    t += C-d
    m += C-d
elif (B+t) - d > 0 : # C에서 이동한 벌수와 B의 합계와 평균값의 차이가 있으면
    t += (B+t)-d
    m += (B+t)-d
# 마지막 A는 평균과의 차이를 더함
t += d-A
print(t)