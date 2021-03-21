count = int(input())
candids = [i for i in range(1, count + 1)]

index = 0
while (len(candids) != 1):

    temp = []
    while (index < len(candids)):
        temp.append(candids[index])
        index += 2
    index %= len(candids)
    candids = temp
    
print(candids[0])
