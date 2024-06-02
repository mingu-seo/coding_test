'''
한수
print(sum(i<100or i//100*21+i==i//10*12for i in range(1,int(input())+1)))
'''

N = int(input())

cnt = 0
for i in range(1, N+1) :
    if i<100 or i//100*21+i == i//10*12 :
        cnt +=1

print(cnt)