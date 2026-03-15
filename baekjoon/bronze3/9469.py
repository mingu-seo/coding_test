P = int(input())

result = [] # 파리 총 이동거리

for i in range(1, P + 1):
    v = input().split()
    N, D, A, B, F = int(v[0]), float(v[1]), float(v[2]), float(v[3]), float(v[4])                                                  
    total = F * D / (A + B)
    # print(i, total)
    result.append(total)

for i,r in enumerate(result) :
    print(i+1, r)