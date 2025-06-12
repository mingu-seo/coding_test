value = input()

result = 0
map = {'a':1, 'A':1, 'B':2, 'b':1, 'D':1, 'd':1, 'e':1, 'g':1, 'O':1, 'o':1, 'P':1, 'p':1, 'Q':1, 'q':1, 'R':1, '@':1}
for v in value :
    result += map.get(v, 0)
print(result)