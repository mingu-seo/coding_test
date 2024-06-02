'''
Shares
'''
import sys

while True:
    try :
        n, s = tuple(map(int, input().split()))
        print(s // (n+1))
    except :
        break