m = int(input())
n = int(input())

min_val = min(m,n)
max_val = max(m,n)

if min_val == 1 :
    print(max_val)
elif min_val == 2 :
    print(max_val*2)
else :
    print(max_val*2 + (min_val-2)*2)