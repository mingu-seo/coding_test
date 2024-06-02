'''
소음

10의 제곱형태로 입력되지만, 문자열형태로 처리
'''
A = input()
O = input()
B = input()

if O == '*' :
    print(A + '0'*(len(B)-1))
elif O == '+' :
    front, rear = (A,B) if len(A) > len(B) else (B,A)
    # print(front[len(front)-len(rear)], rear[0])
    if front[len(front)-len(rear)] == '1' and rear[0] == '1' :
        print(front[:len(front)-len(rear)] + '2' + rear[1:])
    else :
        print(front[:len(front)-len(rear)] + rear)
    