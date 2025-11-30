first = input()
second = input()

f_h, f_m = map(int, first.split(':'))
s_h, s_m = map(int, second.split(':'))

if f_h < s_h :
    print('YES')
else :
    if f_h == s_h :
        if f_m <= s_m :
            print('YES')
        else :
            print('NO')
    else :
        print('NO')
