arr = []
while True :
    X = float(input())
    if X < 0 : break
    arr.append('Objects weighing {:.2f} on Earth will weigh {:.2f} on the moon.'.format(X, X*0.167))

for a in arr :
    print(a)