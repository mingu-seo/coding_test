'''
성 지키기

각 행과 열별로 경비원이 존재하는지 여부
'''
N, M = tuple(map(int, input().split()))
castle = []
for n in range(N) :
    castle.append(input())

# 행체크할 배열과, 열체크할 배열 따로 선언(0으로 초기화)
row_check = [0 for _ in range(N)]
col_check = [0 for _ in range(M)]
result = 0

# 전체 값 반복하여 X인 경우 체크배열 1로 변경
for i, row in enumerate(castle) :
    for j, c in enumerate(row):
        if c == 'X' :
            row_check[i] = 1
            col_check[j] = 1

# 행과 열 모두 경비원이 없는 경우 체크배열 1로 바꾸고 result + 1
for i, row in enumerate(castle) :
    for j, c in enumerate(row):
        if row_check[i] == 0 and col_check[j] == 0 :
            row_check[i] = 1
            col_check[j] = 1
            result += 1

# 위까지 진행한 후에도 0이 남아있으면 +
result += row_check.count(0)
result += col_check.count(0)

# print(row_check)
# print(col_check)

print(result)

