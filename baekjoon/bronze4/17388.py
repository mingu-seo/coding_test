S, K, H = map(int, input().split())

if S+K+H >= 100 :
    print('OK')
else :
    if S < K and S < H :
        print('Soongsil')
    elif K < S and K < H :
        print('Korea')
    else :
        print('Hanyang')