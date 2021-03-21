userCount = int(input())

listNames = []

for i in range(userCount):    
    listNames.append(list(name for name in input().split(' '))[0])

setNames = set(listNames)

hatsCount = -1;
for setName in setNames:
    count = 0;
    for listName in listNames:
        if (setName == listName):
            count += 1;
    if (count > hatsCount):
        hatsCount = count;
print(hatsCount)
