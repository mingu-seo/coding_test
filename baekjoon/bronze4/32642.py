N = int(input())
days = list(map(int, input().split()))

angry = 0
result = []
for d in days :
    if d == 1 :
        angry += 1
    elif d == 0 :
        angry -= 1
    result.append(angry)
print(sum(result))