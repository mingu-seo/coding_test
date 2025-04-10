N, M = map(int, input().split())

if M == 1 or M == 2 :
    print('NEWBIE!')
elif N >= M :
    print('OLDBIE!')
else :
    print('TLE!')