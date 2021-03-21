nums = [int(i) for i in input().split(' ')]
a = nums[0]
b = nums[1]
c = nums[2]

dur1 = [int(i) for i in input().split(' ')]
dur2 = [int(i) for i in input().split(' ')]
dur3 = [int(i) for i in input().split(' ')]

def findMin(temps):
    Min = temps[0]
    for i in range(len(temps)):
        if (temps[i] < Min):
            Min = temps[i]
    return Min

def findMax(temps):
    Max = temps[0]
    for i in range(len(temps)):
        if (temps[i] > Max):
            Max = temps[i]
    return Max
Min = findMin(list((dur1[0], dur2[0], dur3[0])))
Max = findMax(list((dur1[1], dur2[1], dur3[1])))

total = 0
for i in range(Min, Max):
    count = 0
    if (i >= dur1[0] and i < dur1[1]):
        count += 1
    if (i >= dur2[0] and i < dur2[1]):
        count += 1
    if (i >= dur3[0] and i < dur3[1]):
        count += 1
        
    if (count == 1):
        total += (count * a)
    elif (count == 2):
        total += (count * b)
    else:
        total += (count * c)
print(total)
            
