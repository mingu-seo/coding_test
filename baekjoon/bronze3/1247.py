'''
부호
'''
import sys
result = []
for _ in range(3): 
    n = int(sys.stdin.readline())
    total = 0
    for i in range(n) :
        total += int(sys.stdin.readline())
    if total == 0 :
        result.append('0')
    elif total < 0 :
        result.append('-')
    else :
        result.append('+')
for r in result :
    print(r)