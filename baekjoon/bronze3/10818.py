size = int(input())

values = input().split(' ')
values = list(map(int, values));
values.sort()
print(values[0], values[size-1])