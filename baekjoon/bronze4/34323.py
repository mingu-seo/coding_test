N, M, S = map(int, input().split())

# a = int(S * (M+1) * ((100 - N)/100))
a = S * (M+1) * (100 - N)//100
b = S * (M)

# print(a,b)

if a < b :
    print(a)
else :
    print(b)