N = int(input())

y_rank = N
k_rank = N

for n in range(N) :
    name = input()
    if name == 'yonsei' :
        y_rank = n
    elif name == 'korea' :
        k_rank = n
if y_rank < k_rank :
    print('Yonsei Won!')
else :
    print('Yonsei Lost...')