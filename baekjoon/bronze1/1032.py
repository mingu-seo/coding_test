'''
명령 프롬프트

'''
N = int(input())

result = []
text = input()
for t in text:
    result.append(t)
for _ in range(N-1):
    text2 = input()
    for i, c in enumerate(text2):
        if c != result[i] :
            result[i] = '?'

for r in result:
    print(r, end='')