N = int(input())
S = input()

cnt = 0
result = 'No'
for c in S :
    if c == 'o' :
        cnt += 1
        if cnt == 3 :
            result = 'Yes'
            break
    else :
        cnt = 0
print(result)