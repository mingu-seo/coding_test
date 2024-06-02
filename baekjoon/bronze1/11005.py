import string

tmp = string.digits+string.ascii_uppercase
def convert(num, base) :
    q, r = divmod(num, base)
    if q == 0 :
        return tmp[r] 
    else :
        return convert(q, base) + tmp[r]
    
value = input().split()
s = int(value[0])
n = int(value[1])
result = convert(s, n)
print(result)