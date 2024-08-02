L = int(input())
A = int(input())
B = int(input())
C = int(input())
D = int(input())

math = B // D
if B % D > 0 : math += 1

kor = A // C
if A % C > 0 : kor += 1

print(L - max(math, kor))