line = input()

# print(line.split('"'))
cnt = line.count('"')
if cnt < 2 or len(line) < 2:
    print('CE')
else :
    s = line.index('"')
    e = line.index('"', s+1)
    word = line[s+1:e]
    if word == line.replace('"', '') and word != '': # 입력값이 ""인 경우도 체크해야함
        print(word)
    else :
        print('CE')