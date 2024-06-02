'''
그릇

'''
value = input()

height = 0
for i, v in enumerate(value):
    if i == 0 or (i > 0 and value[i-1] != value[i]):
        height += 10
    elif value[i-1] == value[i] :
        height += 5
print(height)