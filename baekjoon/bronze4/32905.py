# 니콜라이는 경영학 강의 중에 학생들에게 프로젝트에 대한 RACI 행렬을 만드는 과제를 부여했습니다. 
# 이 행렬은 프로젝트의 모든 관계자와 각 관계자의 업무 참여 수준을 나열하는 책임 할당에 대한 행렬입니다. 
# 책임 수준은 문자 “R”, “A”, “C”, “I”로 표시됩니다. 참여도가 없는 경우에는 “-”가 사용됩니다. 참여 수준은 다음과 같은 의미를 갖습니다:

# R(Responsible): 작업을 수행합니다(부재 중일 경우 Accountable이 전체 작업을 수행합니다).
# A(Accountable): 책임자로부터 작업을 수락하며 각 작업에 대해 정확히 하나의 인스턴스만 존재해야 합니다. (어떤 개수든 될 수 있는 다른 수준과 달리)
# C(Consulted): 작업 실행 중에 자문을 제공합니다.
# I(informed): 과제 진행 상황에 대한 정보를 수신합니다.
# 학생이 매트릭스의 정확성을 확인하도록 도와주세요.

# 입력
# 첫 번째 줄에는 두 개의 정수
# RACI 행렬의 행과 열 수
# n, m이 주어집니다. (1 <= n, m <= 100).
# 다음줄 부터 n개의 행이 주어지며, 각 행은 공백으로 구분된 m개의 요소가 주어집니다.
# 각 행은 하나의 작업을 의미하고 각 열은 1명의 관계자에 해당합니다.
# 행렬의 각 요소는 대문자 “R”, “A”, “C” 또는 “I” 일 수 있습니다.
# 또는 마이너스 기호인 “-”일 수 있으며, 이는 주어진 관계자가 그 행의 작업에 관여하지 않음을 나타냅니다.

# 출력
# 매트릭스가 올바른 형식이면 "Yes"를, 그렇지 않으면 "No"를 출력합니다.
n, m = map(int, input().split())

result = 'Yes'
for _ in range(n) :
    line = input().split()
    # print(line)
    if result == 'Yes' and line.count('A') != 1 :
        result = 'No'
print(result)