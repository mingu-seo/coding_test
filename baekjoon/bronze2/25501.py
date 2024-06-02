'''
재귀의 귀재

팰린드롬
문자열을 뒤집어도 같은 문자열

'''
def recursion(s, l, r, cnt):
    cnt += 1
    if l >= r: return 1, cnt
    elif s[l] != s[r]: return 0, cnt
    else: return recursion(s, l+1, r-1, cnt)

def isPalindrome(s):
    return recursion(s, 0, len(s)-1, 0)

# print('ABBA:', isPalindrome('ABBA'))
# print('ABC:', isPalindrome('ABC'))

N = int(input())

result = []
for _ in range(N) :
    value = input()
    result.append(isPalindrome(value))

for r in result:
    print(r[0], r[1])