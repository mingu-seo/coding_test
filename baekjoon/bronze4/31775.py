s1 = input()
s2 = input()
s3 = input()

arr = ['l','k','p']

if s1[0] in arr and s2[0] in arr and s3[0] in arr and s1[0] != s2[0] and s1[0] != s3[0]:
    print('GLOBAL')
else :
    print('PONIX')