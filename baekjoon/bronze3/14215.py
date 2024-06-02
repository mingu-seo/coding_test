'''
세 막대

세개 중 가운데 막대로 2등변 삼각형을 만듬
'''
values = [int(i) for i in input().split()]
values.sort()
if values[2] < values[0]+values[1] :
    print(values[0] + values[1] + values[2])
else :
    v2 = (values[0] + values[1]) - 1 
    print(values[0] + values[1] + v2)