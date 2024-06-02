'''
조합 (Combination)
nCr = n! / (n-r)! * r!
7C3 = 7! / (7-3)! * 3!
    = 분모와 분자를 4*3*2*1로 약분하면
    = 7*6*5 / 3*2*1
'''
value = int(input())
print((value) * (value-1) * (value-2) // 6)
print(3)