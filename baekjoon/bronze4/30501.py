N = int(input())

result = ''
for _ in range(N) :
    name = input()
    if 'S' in name :
        result = name
print(result)