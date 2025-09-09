N = input()

loc = 0
value = ''
for i in range(len(N)-1, -1, -1) :
    # print(i)
    if loc != 0 and loc % 3 == 0 :
        value = ',' + value
        
    value = N[i] + value
    loc += 1
print(value)

