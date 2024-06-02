'''
수열

구간합 미리 구해놓고
K 전까지의 합에 구간합 구해서 최대값 비교
'''

N, K = map(int, input().split())

arr = [int(i) for i in input().split()]
s_arr = [i for i in arr]

for i, e in enumerate(arr) :
    if i == 0 :
        s_arr[i] = arr[0]
    else :
        s_arr[i] = s_arr[i-1] + arr[i]
# print(s_arr)
max_value = sum(arr[:K]) # K번째 전에 최대값이 존재할 수 있음
for i in range(K, N) :
    if max_value < s_arr[i]-s_arr[i-K] :
        max_value = s_arr[i]-s_arr[i-K]
print(max_value)