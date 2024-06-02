value = input()
dial = [
    ['A','B','C'],
    ['D','E','F'],
    ['G','H','I'],
    ['J','K','L'],
    ['M','N','O'],
    ['P','Q','R','S'],
    ['T','U','V'],
    ['W', 'X','Y','Z']
]
total = 0
for v in value:
    for i, d in enumerate(dial):
        if d.count(v) > 0:
            total += i+3
print(total)