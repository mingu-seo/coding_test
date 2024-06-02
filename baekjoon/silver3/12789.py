'''
도키도키 간식드리미

줄서있는 학생은 큐형태로
대기학생은 스택으로 처리

다음 학생 처리안되면 중지안하면 시간초과
'''

N = int(input())
students = [int(i) for i in input().split()]

stack = []
next = 1
while next <= N :
    # print(students, next,stack)
    
    if stack and stack[len(stack)-1] == next : # 스택의 마지막값이 다음값인지
        next += 1
        stack.pop()
    elif students and students[0] == next : # 처음값이 다음 값인지
        next += 1
        students.pop(0)
    elif students :
        stack.append(students.pop(0))
    else : # 다음 학생을 처리하지 못하는 경우 반복중지
        break

if students or stack :
    print('Sad')
else :
    print('Nice')
    