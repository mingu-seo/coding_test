cro_char = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
cnt = 0
val = input()
#val = 'ljes=njak'
for c in cro_char:
    # print(c, val)
    cnt = cnt + val.count(c)
    val = val.replace(c,'*')
val = val.replace('*','')
cnt += len(val)
print(cnt)