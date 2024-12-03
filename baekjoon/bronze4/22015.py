abc = list(map(int, input().split()))

abc.sort()

print((abc[2]-abc[1]) + (abc[2]-abc[0]))