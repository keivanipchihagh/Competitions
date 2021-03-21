counts = [int(i) for i in input().split(' ')]

shifts1 = []
shifts2 = []

def getOverLapDays(range1, range2):
    overLapDays = 0;
    for day in range(range1[0], range1[1] + 1):        
        if (day >= range2[0] and day <= range2[1]):
            overLapDays += 1;
    return overLapDays
        

for i in range(counts[0]):
    shifts1.append(list(int(i) for i in input().split(' ')))

for i in range(counts[1]):
    shifts2.append(list(int(i) for i in input().split(' ')))

count = 0;
for item1 in shifts1:
    for item2 in shifts2:
        count += getOverLapDays(item1, item2);
print(count)
