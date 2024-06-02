'''
최대 힙

파이썬 heapq 라이브러리 사용
heappop 기본값은 최소값을 리턴하므로 튜플로 저장(음수, 양수)
결국 가장 작은값이 리턴되므로 양수중 가장 큰값이 리턴됨
'''
import sys
import heapq


N = int(sys.stdin.readline())
heap = []
result = []
for i in range(N) :
    v = int(sys.stdin.readline())
    if v == 0:
        if len(heap) == 0 : 
            result.append(0)
        else :
            result.append(heapq.heappop(heap)[1])
    else :
        heapq.heappush(heap,(-v,v))
    # print(heap)

for r in result :
    print(r)