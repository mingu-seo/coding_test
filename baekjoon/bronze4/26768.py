s = {'a':'4', 'e':'3', 'i':'1', 'o':'0', 's':'5'}

line = input()

for k in s.keys() :
    line = line.replace(k, s[k])
print(line)