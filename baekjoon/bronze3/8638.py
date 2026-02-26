N = int(input())
scores = list(map(int, input().split()))

max_score = sorted(scores)[-1]

result = ''
# print(chr(65))
for i, score in enumerate(scores) :
    if max_score == score :
        result += chr(i+65)
print(result)