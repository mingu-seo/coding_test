'''
약수

진짜 약수들이라면 결국 가장 큰것과 가장작은걸 곱하면 구하고자하는 값이 나옴
'''

S = int(input())
arr = list(map(int, input().split()))

A = max(arr)
B = min(arr)

print(A*B)