n, m = map(int, input().split())

n_list = []

for i in range(n) :
    temp = input()
    temp_list = []
    for c in temp :
        temp_list.append(c)
    n_list.append(temp_list)

# print(n_list)
input()

cnt = 0
for i in range(n) :
    temp = input()
    for j, c in enumerate(temp) :
        if n_list[i][j] == c :
            cnt += 1
print(cnt)