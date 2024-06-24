N = int(input())
arr = map(int, input().split())

s = 0
for i in arr :
    s += i
if s > 0 :
    print('Right')
elif s < 0: 
    print('Left')
else :
    print('Stay')