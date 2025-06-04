#  S 의 각 문자에 대해 J를 O, O를 I, I를 J로 변환

N = int(input())
S = input()

result = ''
for c in S :
    if c == 'J' :
        result += 'O'
    elif c == 'O' :
        result += 'I'
    elif c == 'I' :
        result += 'J'
print(result)