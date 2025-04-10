d_s, y_s = map(int, input().split())
d_m, y_m = map(int, input().split())

sun = y_s - d_s
moon = y_m - d_m

while sun != moon:
    if sun < moon :
        sun += y_s
    else :
        moon += y_m
print(sun)