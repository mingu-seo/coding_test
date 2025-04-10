n = int(input())
picture = []
# 사진파일명 순서대로 저장
for _ in range(n) :
    file = input()
    picture.append(file)

m = int(input())
result = []
# 시작번호 ~ 끝번호 입력받아 해당 인덱스 사진파일명 result에 저장
for _ in range(m) :
    s, e = map(int, input().split())
    for i in range(s-1, e) :
        result.append(picture[i])

for r in result :
    print(r)