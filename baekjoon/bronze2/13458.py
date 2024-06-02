'''
시험 감독

'''
N = int(input())
A = list(map(int, input().split()))
B, C = tuple(map(int, input().split()))

result = 0
for i in range(N):
    remain = A[i] - B
    if remain < 0 : remain = 0 # 응시자보다 감시가능한 사람이 더 많은경우 음수가 나올 수 있으므로 0으로 처리
    result += 1
    result += remain // C
    if remain % C > 0 : result+=1
print(result)