size = int(input())

word_count = 0
for i in range(size):
    word = input()
    isGroup = True
    for j,c in enumerate(word):
        if j==0 or c == word[j-1] : continue
        # print(c, word[0:j])
        if c in word[0:j-1] :
            # print('False', c, word[0:j])
            isGroup = False
            break
    if isGroup : word_count += 1
print(word_count)

