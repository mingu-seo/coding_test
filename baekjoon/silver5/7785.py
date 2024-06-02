'''
입력값을 배열로 저장하면서 값을 비교하면서 이름저장
값입력받는 반복안에서 퇴근한 직원까지 같이 체크

남은 배열값 정렬 후 출력
'''

import sys
n = int(sys.stdin.readline())

person = {}
for i in range(n):
    values = sys.stdin.readline().split()
    if person.get(values[0]):
        person.pop(values[0])
    else :
        person[values[0]] = values[1]

name = list(person.keys())


name.sort(reverse=True)
for n in name:
    print(n)