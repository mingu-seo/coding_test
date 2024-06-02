'''
괄호

)가 입력되면 마지막값이 (이면 삭제
그렇지 않으면 추가
'''
K = int(input())

result = []
for _ in range(K):
    stack = []
    values = input()
    for v in values :
        if v == ')' :
            if stack and stack[len(stack)-1] == '(' :
                stack.pop()
            else :
                stack.append(v)
        else :
            stack.append(v)
    # print(stack)
    if stack :
        result.append('NO')
    else :
        result.append('YES')

for r in result :
    print(r)
    