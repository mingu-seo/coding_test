N = int(input())
S = input()

cnt = 0
for c in S :
    if c in {'a','e','i','o','u'} :
        cnt += 1
print(cnt)