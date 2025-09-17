
result = []
for _ in range(6) :
    line = input().strip()
    result.append(len(line))

print('Latitude {}:{}:{}'.format(result[0], result[1], result[2]))
print('Longitude {}:{}:{}'.format(result[3], result[4], result[5]))