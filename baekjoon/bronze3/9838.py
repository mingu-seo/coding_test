n = int(input())
values = []
for _ in range(n) :
    values.append(int(input()))

result = [0 for _ in values]
for i, v in enumerate(values) :
    # print(i,v)
    result[v-1] = i+1

for r in result :
    print(r)