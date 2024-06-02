import sys
result = []
while True:
    val = sys.stdin.readline()
    if val == '\n' or val == '' or not val:
        for r in result:
            print(r, end='')
        break
    else :
        result.append(val)