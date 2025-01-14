mbti = input()
N = int(input())
r = 0

for _ in range(N) :
    v = input()
    if mbti == v : r += 1
print(r)