result = [0,0,0,0,0]

scores = []
for _ in range(5) :
    scores.append(list(map(int, input().split())))

# print(scores)

for i in range(5) :
    idx = 0
    for j in range(5) :
        if i == j :
            pass
        else :
            result[i] += scores[i][idx]
            idx += 1

# print(result)

max_n = 0
max_v = 0


for i,r in enumerate(result) :
    if max_v < r :
        max_v = r
        max_n = i+1
print(max_n, max_v)