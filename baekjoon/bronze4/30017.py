A, B = map(int, input().split())

result = 0

if A > B :
    result = (B+1) + B
elif A < B :
    result = A + (A-1)
else :
    result = (A-1) + B
print(result)