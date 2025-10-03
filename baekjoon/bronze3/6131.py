A2 = []
B2 = []

N = int(input())

for i in range(1, 501) :
    A2.append(i*i)
    B2.append(i*i)

# print(len(A2), len(B2))

cnt = 0

for i in range(len(B2)) :
    for j in range(len(A2)) :
        # print(i,j)
        if A2[j] - B2[i] == N:
            cnt += 1
        elif A2[j] - B2[i] > N :
            break
print(cnt)