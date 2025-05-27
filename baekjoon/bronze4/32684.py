ch = list(map(int, input().split()))
han = list(map(int, input().split()))

c = [13, 7, 5, 3, 3, 2]

ch_sum = 0
han_sum = 0

for i, e in enumerate(ch) :
    ch_sum += ch[i] * c[i]
    han_sum += han[i] * c[i]

han_sum += 1.5

if ch_sum > han_sum :
    print('cocjr0208')
else :
    print('ekwoo')