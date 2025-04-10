n, m = map(int, input().split())

t = 0
for _ in range(n) :
    line = input()
    for c in line :
        if c == '+' :
            t += 1
            break
print(t)
