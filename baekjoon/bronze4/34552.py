M = list(map(int, input().split()))
N = int(input())
price = 0

for _ in range(N) :
    value = input().split()
    B = int(value[0])
    L = float(value[1])
    S = int(value[2])

    if L >= 2 and S >= 17 :
        price += M[B]

print(price)