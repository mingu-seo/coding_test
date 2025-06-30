arr = []
while True :
    value = input()
    if value == '0' : break
    line = list(map(int, value.split()))
    a = line[0]
    a_ = line[1:]
    # print(a, a_)
    result = 1
    for i in range(a) :
        result = result * a_[i*2] - a_[i*2+1]
    arr.append(result)

for a in arr :
    print(a)