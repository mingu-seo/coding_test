line = input().split()

result = 0
if line[1] == 'miss' :
    result = 0
elif line[1] == 'bad' :
    result = int(line[0]) * 200
elif line[1] == 'cool' :
    result = int(line[0]) * 400
elif line[1] == 'great' :
    result = int(line[0]) * 600
elif line[1] == 'perfect' :
    result = int(line[0]) * 1000
print(result)