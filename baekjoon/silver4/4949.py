'''
균형잡힌 세상

입력된 한줄의 문자열에서 (이거나 [이면 스택에 넣고
], )이면 스택마지막 값과 비교해서 같으면 제거, 다르면 추가
반복이 끝나고 스택에 값이 없어야 yes
'''

result = []
while True :
    line = input()
    if line == '.' :
        break
    else :
        stack = []
        for c in line :
            if c == '(' or c == '[' :
                stack.append(c)
            elif c == ')':
                if stack and stack[len(stack)-1] == '(' :
                    stack.pop()
                else :
                    stack.append(c)
            elif c == ']':
                if  stack and stack[len(stack)-1] == '[' :
                    stack.pop()
                else :
                    stack.append(c)
        if stack :
            result.append('no')
        else :
            result.append('yes')
for r in result :
    print(r)