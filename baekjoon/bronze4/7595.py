arr = []
while True :
    n = int(input())
    if n ==0 : break
    for i in range(n) :
        arr.append('*'*(i+1))

for a in arr :
    print(a)
    