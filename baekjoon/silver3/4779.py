'''
칸토어 집합

'''

def func(arr) :
    size = len(arr) # 배열길이
    if size <= 1:
        return arr
    term = size // 3
    left = arr[0:term]
    right = arr[-term-1:-1]
    middle = [0]*term
    # return left + middle + right
    return func(left) + middle + func(right)

# print(func([1]*27))

result = []
while True:
    try :
        N = int(input())
        v = 3 ** N
        arr = [1 for i in range(v)]
        result.append(func(arr))
    except :
        break

for r in result :
    for v in r :
        if v == 1 :
            print('-', end='')
        else :
            print(' ', end='')
    print()