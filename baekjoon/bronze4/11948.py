score1 = []
score2 = []

for _ in range(4) : 
    score1.append(int(input()))
for _ in range(2) :
    score2.append(int(input()))

score1 = sorted(score1, reverse=True)
score2 = sorted(score2, reverse=True)

# print(score1)
# print(score2)

total = score1[0]+score1[1]+score1[2] + score2[0]
print(total)