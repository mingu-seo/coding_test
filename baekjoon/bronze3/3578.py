h = int(input())

cnt = 0
if h == 0 :
    print(1)
elif h == 1 :
    print(0)
else :
    cnt = h // 2
    result = '8' * cnt
    if h % 2 == 1 : result = '4' + result
    print(result)