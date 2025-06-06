# 비타로는 JOI 철도를 타고 여행을 한다. JOI 철도의 운임은 처음 P km까지는 1 km 당 A 엔, 그 이후의 운임은 1 km 당 B 엔으로 계산된다. Q km 승차할 때, 운임은 얼마가 되는지 출력하라.

P, Q = map(int, input().split())
A, B = map(int, input().split())

result = 0
if Q <= P :
    result = Q * A
else :
    result = P*A + (Q-P) * B
print(result)
