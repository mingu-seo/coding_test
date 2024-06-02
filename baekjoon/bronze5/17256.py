ax,ay,az = tuple(map(int, input().split()))
cx,cy,cz = tuple(map(int, input().split()))

bx = cx - az
by = cy / ay
bz = cz - ax

print(bx, int(by), bz)