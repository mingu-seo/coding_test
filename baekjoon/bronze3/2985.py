a, b, c = map(int, input().split())

op = ['+', '-', '*', '/']

def cal(a, b, oper) :
    if oper == '+' :
        return a+b
    elif oper == '-' :
        return a-b
    elif oper == '*' :
        return a*b
    elif oper == '/' :
        return a/b


result = ''
for i, o in enumerate(op) :
    # print(i,o)
    if cal(a,b,o) == c :
        result = '{}{}{}={}'.format(a,o,b,c)
        break
    elif cal(b,c,o) == a :
        result = '{}={}{}{}'.format(a,b,o,c)
        break
print(result)