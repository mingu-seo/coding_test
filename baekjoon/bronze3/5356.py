# print(chr(65))

number = int(input())
for _ in range(number) :
    a1, a2 = input().split()
    n = int(a1) # 반복횟수
    c = ord(a2)

    for i in range(1, n+1) :
        print(chr(c) * i)
        c = c + 1
        if c > 90 : c = 65
    print()