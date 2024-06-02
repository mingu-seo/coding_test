'''
TV 크기
'''
import math
D, H, W = tuple(map(int, input().split()))
# D, H, W = 52, 9, 16
# D, H, W = 7, 2, 3
# D, H, W = 13, 7, 10
# D, H, W = 7, 32, 47
# D, H, W = 11, 15, 16

D2 = D**2
v = H**2 + W**2
r = (D2 / v) ** 0.5

print(math.floor(H * r), math.floor(W * r))