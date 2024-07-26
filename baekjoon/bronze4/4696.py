# 그 해에 만난 아내, 아내당 자루, 고양이당 고양이의 수
# n^0 + n^1 + n^2 + n^3 + n^4

arr = []
while True :
    n = float(input())
    if n == 0 :
        break
    arr.append("{:.2f}".format(n**0 + n**1 + n**2 + n**3 + n**4,2))
for a in arr :
    print(a)