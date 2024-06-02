a = input()
b = input()

b_idx = len(b)
for i in range(b_idx-1, -1, -1) :
    print(int(a) * int(b[i]))
print(int(a) * int(b))