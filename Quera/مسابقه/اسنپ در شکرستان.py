nums = [int(i) for i in input().split(' ')]

Map = []
for i in range(nums[0]):
    Map.append([int(i) for i in input().split(' ')])

Trips = []
for i in range(nums[1]):
    Trips.append([int(i) for i in input().split(' ')])

cost = 0
for Trip in Trips:
    cost += Map[Trip[0] - 1][Trip[1] - 1]
print(cost)
