n1, n2, n12 = tuple(map(int, input().split()))
import math
N = math.floor((n1+1) * (n2+1) / (n12+1) -1)

print(N)