'''
입력숫자
'''

# N = int(input())
# NUM = list(map(int, input().split()))
N = 5
NUM = [1,2,3,4,5]
print(N)
print(NUM)

result = []

count, from_idx, value = 0, 0, NUM[0]
while count < N:
    while value == 0:
        from_idx = (from_idx + 1) % N
        value = NUM[from_idx]
    print(value, end=' ')
    
    count += 1
    NUM[from_idx] = 0
    from_idx = (value + from_idx) % N
    print('from_idx:{}'.format(from_idx))
    value = NUM[from_idx]

print(result)

