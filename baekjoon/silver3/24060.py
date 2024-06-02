'''
알고리즘 수업 - 병합 정렬1

'''
def find(start, end) :
    global K
    if start == end : 
        return # 배열의 원소의 개수가 1이면 정렬 진행하지 않음
    mid = (start+end)//2
    find(start, mid)
    find(mid+1, end) # 원소 수가 적은 배열부터 정렬하므로 배열의 원소를 둘로 나눈 것부터 정렬 진행
    if K <=end-start+1 : # K번째에 원소를 넣는 배열인지 확인 (정렬하려는 배열의 크기 >= K인지 확인)
        J = sorted(I[start:end+1]) # 우리가 원하는 배열만 정렬
        print(J[K-1])
        exit() # A에 몇번째 들어가는지 확인 후 정렬된 배열에서 그 수 출력, 프로그램 종료
    K -= end-start+1 # 정렬하려는 배열의 크기 < K면 우리가 원하는 배열이 아니므로 A에 원소가 들어간 만큼 K에서 빼줌 

N, K = map(int,input().split())
I = list(map(int,input().split()))
find(0, N-1)
print(-1) # 만약 이 과정을 진행했는데 프로그램이 종료되지 않았다면 저장 횟수가 K보다 작은 것이므로 -1 출력

