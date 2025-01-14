# - 월 요금은 a 루블입니다. 매일 첫 30분은 무료지만, 그 이후부터는 1분마다 x 루블이 부과됩니다.

# - 월 요금은 b 루블입니다. 매일 첫 45분은 무료지만, 그 이후부터는 1분마다 y 루블이 부과됩니다. 

a = int(input())
x = int(input())
b = int(input())
y = int(input())
T = int(input())

a2 = (T-30)*21 * x
b2 = (T-45)*21 * y

if a2 < 0 : a2 = 0
if b2 < 0 : b2 = 0

a_t = a + a2
b_t = b + b2

print(a_t, b_t)