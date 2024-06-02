# import sys

valStr = []
while True :
    try :
        # val = sys.stdin.readline()
        val = input()
        if val == '' :
            break
        
        valStr.append(val.split(' '))
    except :
        break


for val in valStr:
    print(int(val[0]) + int(val[1]))