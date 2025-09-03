# 3의 배수인 숫자에는 "Dead"라고, 5의 배수인 숫자에는 "Man"이라고 말하기로 했습니다. 3과 5의 배수인 숫자에는 "DeadMan"

n = int(input())

for i in range(1, n+1) :
    if i % 3 == 0 and i % 5 == 0 :
        print('DeadMan')
    elif i % 3 == 0 :
        print('Dead')
    elif i % 5 == 0 :
        print('Man')
    else :
        print(i, end=' ')