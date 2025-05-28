from sys import stdin
T = int(input())

result = 0
for _ in range(T) :
    N = int(stdin.readline())
    A, B = map(int, stdin.readline().split())
    each_result = 0
    for _ in range(N) :
        u, v = map(int, stdin.readline().split())
        if u <= A and v <= B :
            each_result +=1
    if each_result == N :
        result += 1

for i in range(result) :
    print('Material Management ' + str(i+1))
    print('Classification ---- End!')