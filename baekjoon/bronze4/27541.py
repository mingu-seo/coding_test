N = int(input())
S = input()

if S[N-1] == 'G' :
    print(S[:N-1])
else :
    print(S+'G')