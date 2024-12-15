w1 = int(input())
h1 = int(input())
w2 = int(input())
h2 = int(input())

# 넓이는 큰거에 두배 + 높이는 각각더해서 두배 + 네모서리
total = max(w1, w2)*2 + (h1+h2)*2 + 4
print(total)
