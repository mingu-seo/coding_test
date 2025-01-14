s_h, s_m, s_s = map(int, input().split(' : '))
e_h, e_m, e_s = map(int, input().split(' : '))

s = s_h * 3600 + s_m * 60 + s_s
e = e_h * 3600 + e_m * 60 + e_s

t = e-s if e >= s else (24*3600 - s) + e
print(t)