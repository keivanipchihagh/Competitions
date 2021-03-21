count = int(input())

attributes = []

for i in range(count):
    attributes.append([int(i) for i in input().split(' ')])

usefullCount = 0

def isUsefull(price, quality, attributes):
    count = 0
    for attribute in attributes:
        if (attribute[0] <= price and attribute[1] >= quality):
            count += 1
    if (count >= 2):
        return False
    else:
        return True

total = 0
for i in range(count):

    price = attributes[i][0]
    quality = attributes[i][1]

    if (isUsefull(price, quality, attributes)):
        total += 1
print(total)

    
