n = int(input())
arr = list(map(int, input().split()))

m_v = arr[0]
m_i = 0

for i, v in enumerate(arr) :
    if m_v > v :
        m_v = v
        m_i = i
print(m_i)