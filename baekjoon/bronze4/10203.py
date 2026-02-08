text = ['a', 'e', 'i', 'o', 'u']
values = []
counts = []

N = int(input())
for _ in range(N) :
    value = input()
    cnt = 0
    for c in text :
        cnt += value.count(c)
    values.append(value)
    counts.append(cnt)

for i, v in enumerate(values) :
    print('The number of vowels in {} is {}.'.format(v, counts[i]))