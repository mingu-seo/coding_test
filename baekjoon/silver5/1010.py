'''
다리 놓기

문제를 복잡하게 적어놨지만 결국 반대쪽 강건너 동쪽 사이트의 경우의 수의 서쪽개수만큼의 조합이다.

동C서
'''
# 컴비네이션
# from itertools import combinations # 이거 쓰면 시간초과
from math import comb
import sys

N = int(sys.stdin.readline())

result = []
for _ in range(N):
    values = sys.stdin.readline().split()
    result.append(comb(int(values[1]), int(values[0])))

for r in result :
    print(r)