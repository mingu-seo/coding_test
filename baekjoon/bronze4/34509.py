
for n in range(11, 100) :
    n_r = int(str(n)[-1::-1])
    if n_r % 4 == 0 :
        s = 0
        n_r2 = str(n_r)
        if '8' not in n_r2 :
            for c in n_r2 :
                s += int(c)
            if s % 6 == 0 :
                print(n)
                break
        