'''
책 페이지

시작값~종료값까지의 포함된 숫자 구하기

시작값은 +1 해서 0까지
종료값은 -1 해서 9까지

종료값-시작값

재귀함수로 반복

'''

N = int(input())
result = [0 for i in range(10)]

size = len(str(N))

# 배열에 1씩 더해주는 함수
def plus (n, v) :
    while n > 0 :
        result[n % 10] += v
        n = n // 10

def recursive(start, end, number) :
    # start를 1씩 더하면서 0이 될때까지 배열 추가
    while start % 10 != 0 and start <= end :
        plus(start, number)
        start += 1
    if end < start : return
    # 일의 자리 처리
    while end % 10 != 9 and end >= start:
        plus(end, number)
        end -= 1
    # print(end)

    # 자리수만큼 각 배열에 더해줌
    value = end // 10 - start // 10 + 1
    for i in range(10) :
        result[i] += value * number 

    recursive(start // 10, end // 10, number*10)

recursive(1, N, 1)

print(*result)