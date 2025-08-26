# 선수의 신체 능력이 요구되는 최소 중량 및 최소 힘 이상이고 최소 속도 이하라면 그 포지션에서 뛸 수 있습니다. 
# 선수가 여러 포지션에서 뛸 수 있다면, 위 표에 제시된 순서대로 공백으로 구분해 모두 출력합니다. 
# 각 줄 끝에 공백을 남길 수 있습니다. 선수가 어떤 포지션에서도 뛸 수 없다면, "No positions"


result = []
while True :
    ss, mw, ms = map(float, input().split())
    if ss == 0 and mw == 0 and ms == 0 :
        break
    text = ''
    if mw >= 150 and ms >= 200 and ss <= 4.5 :
        text += "Wide Receiver"
    if mw >= 300 and ms >= 500 and ss <= 6.0 :
        if text != '' : text += ' '
        text += "Lineman"
    if mw >= 200 and ms >= 300 and ss <= 5.0 :
        if text != '' : text += ' '
        text += 'Quarterback'
    if text == '' : 
        result.append('No positions')
    else :
        result.append(text)

for r in result :
    print(r)
