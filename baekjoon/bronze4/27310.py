#  이모지의전체길이콜론의개수언더바의개수
# $(\text{이모지의 전체 길이}) +(\text{콜론의 개수}) +(\text{언더바의 개수})\times 5$로

line = input()
a = len(line)
b = line.count(':')
c = line.count('_')
print(a + b + c * 5)