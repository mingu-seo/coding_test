X, Y, Z = map(int, input().split())
U, V, W = map(int, input().split())

U2 = U // 100
V2 = V // 50
W2 = W // 20

price = 0
price += U2 * X
price += V2 * Y
price += W2 * Z

if U % 100 > 0 : price += 100
if V % 50 > 0 : price += 50
if W % 20 > 0 : price += 20


print(price)