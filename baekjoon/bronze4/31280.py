a, b, c, d = map(int, input().split())

print(sum([a,b,c,d]) - min(a,b,c,d) + 1)