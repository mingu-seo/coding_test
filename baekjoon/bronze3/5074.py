result = []

while True :
    value = input()
    if value == '00:00 00:00' :
        break
    time = value.split()
    s_hour, s_min = map(int, time[0].split(':'))
    e_hour, e_min = map(int, time[1].split(':'))

    # print(s_hour, s_min, e_hour, e_min)
    hour = s_hour + e_hour
    minute = s_min + e_min

    if minute >= 60 :
        hour += minute // 60
        minute = minute % 60
    d = 0
    if hour >= 24 :
        d = hour // 24
        hour = hour % 24
    # print(hour, minute)
    result.append([hour, minute, d])

for r in result :
    print('{}:{} {}'.format(r[0] if r[0] >= 10 else '0'+str(r[0]), r[1] if r[1] >= 10 else '0'+str(r[1]), '+'+str(r[2]) if r[2] > 0 else ''))