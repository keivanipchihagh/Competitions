seatNames = []

for i in range(4):
    temp = [i for i in input().split(' ')]
    if (temp[1] == 'L'):
        seatNames.insert(0, temp[0])
    elif (temp[1] == 'R'):
        seatNames.append(temp[0])
print(seatNames[1])
