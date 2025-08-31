n = int(input())

cnt = 0
for _ in range(n) :
    record = input()
    for i, s in enumerate(record) :
        if i > 0 and s == 'D' :
            if record[i-1] == 'C' :
                cnt += 1
                break
print(n - cnt)