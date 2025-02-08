line = input()
# print(len(line))
start = len(line)-1
for i in range(len(line)-1, -1, -1) :
    if line[i] != '0' :
        start = i
        break
    
cnt = 0
for i in range(start) :
    if line[i] == '0' : cnt += 1

print(cnt)