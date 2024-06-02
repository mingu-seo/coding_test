N = int(input())
card1 = [n for n in input().split()]

card1Dict = {}
for c in card1:
    if card1Dict.get(c):
        card1Dict[c] = card1Dict[c]+1
    else :
        card1Dict[c] = 1

M = int(input())
card2 = [n for n in input().split()]
result = []
for c in card2:
    if card1Dict.get(c):
        result.append(card1Dict[c])
    else :
        result.append(0)
print(*result)