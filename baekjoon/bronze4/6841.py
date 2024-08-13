shortForm = {
    'CU':'see you',
    ':-)':'I’m happy',
    ':-(':'I’m unhappy',
    ';-)':'wink',
    ':-P':'stick out my tongue',
    '(~.~)':'sleepy',
    'TA':'totally awesome',
    'CCC':'Canadian Computing Competition',
    'CUZ':'because',
    'TY':'thank-you',
    'YW':'you’re welcome',
    'TTYL':'talk to you later'
}

arr = []
while True :
    a = input()
    if shortForm.get(a) :
        arr.append(shortForm.get(a))
    else :
        arr.append(a)
    if a == 'TTYL' :
        break

for a in arr :
    print(a)
