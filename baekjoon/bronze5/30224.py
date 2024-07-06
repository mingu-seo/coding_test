N = input()

contain7 = '7' in N
divide7 = int(N) % 7 == 0
if not contain7 and not divide7 :
    print(0)
elif not contain7 and divide7 :
    print(1)
elif contain7 and not divide7 :
    print(2)
elif contain7 and divide7 :
    print(3)
