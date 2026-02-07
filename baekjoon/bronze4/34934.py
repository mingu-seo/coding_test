N = int(input())

result = ''
max_year = 0
for _ in range(N) :
    values = input().split()
    if max_year < int(values[1]) :
        max_year = int(values[1])
        result = values[0]
print(result)
