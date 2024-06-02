'''
가로수
각 배열의 거리를 구해 배열로 넣고
개수 = 간격 // 최대공약수 - 1
'''
def gcd(x,y) :
    if y == 0 : return x
    return gcd(y, x%y)


N = int(input())
arr = []
for i in range(N):
    arr.append(int(input()))

dist = []
for i,a in enumerate(arr) :
    if i > 0 :
        v = arr[i] - arr[i-1]
        dist.append(v)

g = dist[0] # 최소공약수를 구하기 위한 첫번째 값, 반복문 안에서는 변수가 계속 바뀜
for i in range(len(dist)):
    g = gcd(g, dist[i])

result = 0
for d in dist :
    result += d // g - 1 # 개수 = 간격 // 최대공약수 - 1
print(result)
