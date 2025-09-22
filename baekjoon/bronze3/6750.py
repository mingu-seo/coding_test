# I, O, S, H, Z, X, and N.
chars = ['I', 'O', 'S', 'H', 'Z', 'X', 'N']

result = 'YES'
value = input()

for v in value :
    if v not in chars :
        result = 'NO'
        break
print(result)