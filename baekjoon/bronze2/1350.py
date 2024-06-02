'''
진짜 공간
'''
N = int(input())
disks = tuple(map(int, input().split()))
fileSize = int(input())

total = 0
for d in disks :
    total += d // fileSize
    if d % fileSize > 0 :
        total += 1
print(total * fileSize)