A, C, E = map(int, input().split())

x, y, z = map(int, input().split())

# A기준은 A, C, E 기준 모두 만족
if x >= A and y >= C and z >= E :
    print('A')

# C기준은 C, E 기준 모두 만족
elif y >= C and z >= E :
## 절반 이상의 A기준 만족하면 B
    if x >= A/2 :
        print('B')
    else :
        print('C')

# E기준은 모든 E기준 만족
elif z >= E :
## 절반 이상의 C기준 만족하면 D
    if y >= C/2 :
        print('D')
    else :
        print('E')
