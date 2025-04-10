a1, p1 = map(int, input().split())
r1, p2 = map(int, input().split())

import math
a = p1 / a1
r = p2 / (r1 ** 2 * math.pi)

if a > r :
    print('Whole pizza')
else :
    print('Slice of pizza')
# print(max(a, r))