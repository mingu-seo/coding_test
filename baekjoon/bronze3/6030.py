P, Q = map(int, input().split())

for p in range(1, P+1) :
    if P % p == 0 :
        for q in range(1, Q+1) :
            if Q % q == 0 :
                print(p,q)
