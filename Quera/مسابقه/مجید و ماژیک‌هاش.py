numCount = int(input())
nums = [int(i) for i in input().split(' ')]

numSet = set({})
for item in nums:
    numSet.add(item)

smallestCount = 100
smallestCountItem = list(numSet)[0]

for item in numSet:
    count = 0
    for i in nums:
        if item == i:
            count += 1;
    if (count < smallestCount or (count == smallestCount and item < smallestCountItem)):
        smallestCount = count
        smallestCountItem = item

print(smallestCountItem)
        
