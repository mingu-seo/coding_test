import itertools

# help(itertools.combinations)
values = []
J = int(input())
for i in range(1, J) : # 골넣은 등번호 선수 빼고 나머지 3명으로 조합 구하기
    values.append(i)
v = itertools.combinations(values, 3)
print(len(list(v)))