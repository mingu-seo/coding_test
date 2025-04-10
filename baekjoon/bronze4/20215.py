w, h = map(int, input().split())

import math
p = math.sqrt(pow(w,2) + pow(h,2))
a = w + h

print(abs(a - p))