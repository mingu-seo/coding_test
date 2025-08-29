cnt = 0
while True :
    try :
       l = input()
       cnt += 1
    except EOFError:
        break
print(cnt)