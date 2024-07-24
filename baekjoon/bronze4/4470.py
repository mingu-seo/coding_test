N = int(input())

arr = []
for _ in range(N) :
    arr.append(input())

for i, e in enumerate(arr) :
    print("{}. {}".format(i+1,e))

