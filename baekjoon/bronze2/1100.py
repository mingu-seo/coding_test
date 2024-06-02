'''
하얀 칸
'''

result = 0
for i in range(8):
    for j, c in enumerate(input()):
        if i % 2 == 0 :
            if j % 2 == 0:
                if c == 'F' :
                    result+=1
        else :
            if j % 2 == 1 :
                if c == 'F' :
                    result+=1
print(result)