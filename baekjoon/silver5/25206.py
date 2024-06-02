table = {
    'A+':4.5,
    'A0':4.0,
    'B+':3.5,
    'B0':3.0,
    'C+':2.5,
    'C0':2.0,
    'D+':1.5,
    'D0':1.0,
    'F':0.0
}

myscore = 0
size = 20
total = 0
for i in range(size):
    val = input().split(' ')
    if val[2] == 'P' :
        continue
    score = float(val[1])
    grade = table[val[2]]
    myscore += score * grade
    total += score
print(myscore / total)