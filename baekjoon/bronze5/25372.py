N = int(input())

result = []
for _ in range(N):
    val = input()
    if (len(val) >= 6 and len(val) <= 9) :
        result.append('yes')
    else :
        result.append('no')

for r in result :
    print(r)