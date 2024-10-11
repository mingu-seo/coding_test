N, M, K = map(int, input().split())

'''
4 3 2
N : 전체카드 수
M : 앞면이 O인 수
X : 뒤면이 O인 수 
    O  X
앞:  3  1
뒤:  2  2
'''

f_o = M # 앞O
f_x = N - M #앞X 
r_o = K # 뒤O
r_x = N - K # 뒤X

# O인 것중에 작은 수 + X인 것중에 작은수
v = min(f_o, r_o) + min(f_x, r_x)
print(v)