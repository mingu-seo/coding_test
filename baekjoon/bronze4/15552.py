import sys
val = int(sys.stdin.readline())
strArr = []
for i in range(val):
    strArr.append(sys.stdin.readline().split(' '))

for s in strArr:
    print(int(s[0]) + int(s[1]))