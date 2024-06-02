'''
거스름돈

'''
money = 1000 - int(input())

count = 0

count += money // 500
count += money % 500 // 100
count += money % 100 // 50
count += money % 50 // 10
count += money % 10 // 5
count += money % 5 // 1

print(count)