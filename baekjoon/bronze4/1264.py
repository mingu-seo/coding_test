'''
모음의 개수

'''

result = []
while True :
    v = input()
    text = ['a', 'e', 'i', 'o', 'u']
    if v == '#' :
        break
    else :
        cnt = 0
        for s in v :
            if s.lower() in text : cnt += 1
        result.append(cnt)

for r in result :
    print(r)
