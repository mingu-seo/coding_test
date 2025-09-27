n = int(input())

words = input().split(' ')
# print(words)
result = ''
word_size = 0

for word in words :
    # print(word, word_size)
    if word_size == 0 : result += word[word_size]
    else :
        if word_size > len(word) :
            result += ' '
        else :
            result += word[word_size-1]
    word_size = len(word)
print(result)