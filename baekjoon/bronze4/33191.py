b = int(input())

v1 = int(input())
v2 = int(input())
v3 = int(input())

result = ''
if b >= v1 :
    result = "Watermelon"
elif b >= v2 :
    result = "Pomegranates"
elif b >= v3 :
    result = "Nuts"
else :
    result = "Nothing"
print(result)