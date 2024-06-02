'''
저작권

올림한값이므로 -1해서 곱하고 +1
'''
A, I = tuple(map(int, input().split()))

# I = math.ceil(V / A)
# A -= A / (A-1)
print((I-1)*A+1)