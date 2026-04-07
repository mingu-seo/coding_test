numbers = [2,7,6,5,4,3,2]
mapping = {0:'J', 1:'A', 2:'B', 3:'C', 4:'D', 5:'E', 6:'F', 7:'G', 8:'H', 9:'I', 10:'Z'}

value = input()
result = 0
for i, v in enumerate(value) :
    result += int(v) * numbers[i]
print(mapping[result%11])