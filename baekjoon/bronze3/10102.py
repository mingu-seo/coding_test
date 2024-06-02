'''
개표
'''
N = int(input())
result = {'A':0, 'B':0}
value = input()
for s in value :
    result[s] += 1
if result['A'] > result['B'] : print('A')
elif result['A'] < result['B'] : print('B')
else : print('Tie')