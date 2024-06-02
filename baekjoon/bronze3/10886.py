'''
0 = not cute / 1 = cute
'''
N = int(input())

arr = [0,0]
for i in range(N):
    v = int(input())
    arr[v] +=1 
if arr[0] > arr[1] :
    print('Junhee is not cute!')
else :
    print('Junhee is cute!')