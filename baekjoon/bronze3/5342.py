item = {
    'Paper':57.99,
    'Printer':120.50,
    'Planners':31.25,
    'Binders':22.50,
    'Calendar':10.95,
    'Notebooks':11.20,
    'Ink':66.95
}

result = 0
while True :
    value = input()
    if value == 'EOI' :
        break
    result += item[value]
print('$'+str(result))