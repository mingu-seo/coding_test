values = [int(i) for i in input().split()]

scores = [int(i) for i in input().split()]
scores.sort(reverse=True)
print(scores[values[1]-1])