w = float(input())
h = float(input())

bmi = w / h ** 2

if bmi > 25 :
    print('Overweight')
elif bmi >= 18.5 :
    print('Normal weight')
else :
    print('Underweight')