n, cost = map(int, input().split())

total = 0
bedroom_cost = 0
balcony_cost = 0
cost_flat = 0
# Reduced total area is the total area of all rooms except for balconies plus one half of balconies total area.

for _ in range(n) :
    area, room = input().split()
    total += int(area)
    if room == 'bedroom' :
        bedroom_cost += int(area)
    elif room == 'balcony' :
        balcony_cost += int(area)

cost_flat = cost * (total - balcony_cost / 2)
print(total)
print(bedroom_cost)
print(cost_flat)