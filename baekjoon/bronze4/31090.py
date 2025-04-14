T = int(input())

result = []
for _ in range(T) :
    cur_year = int(input())
    next_year = cur_year + 1
    if next_year % (cur_year % 100) == 0 :
        result.append('Good')
    else :
        result.append('Bye')

for r in result :
    print(r)