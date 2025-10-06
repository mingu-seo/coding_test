t1 = int(input())
t2 = int(input())

result = [t1, t2]
idx = 1

while True :
    t = result[idx-1] - result[idx]
    if t <= result[idx] :
        result.append(t)
        idx += 1
    else :
        result.append(t)
        break

print(len(result))