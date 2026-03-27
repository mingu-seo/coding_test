cards = {}

for _ in range(51) :
    value = input().split(' ')
    if cards.get(value[0]) :
        cards[value[0]].append(int(value[1]))
    else :
        cards[value[0]] = [int(value[1])]
# print(cards)

for k,v in cards.items() :
    if len(v) == 12 :
        numbers = set(range(1,14))
        result = numbers - set(v)
        print(k, result.pop())
        break
