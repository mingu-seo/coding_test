'''
초콜릿 자르기

'''

# N, M = 1, 1
N, M = map(int, input().split())
cnt = 0
def cut(nm) :
    global cnt
    if nm >= 2 :
        cnt += 1
        
        cut(nm // 2)
        cut(nm - nm // 2)

cut(N * M)
print(cnt)