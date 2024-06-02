value = [int(i) for i in input().split()]

pokemon = {}

for num in range(value[0]):
    name = input()
    pokemon[name] = str(num+1)
    pokemon[str(num+1)] = name

quiz = []
for i in range(value[1]) :
    quiz.append(input())


for q in quiz :
    print(pokemon[q])