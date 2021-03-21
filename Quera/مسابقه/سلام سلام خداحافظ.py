count = int(input())
names = [i for i in input().split(' ')]

def sayHi(current, names):
    temp = [name for name in range(0, names.index(current))]
    [print(current + ": salam " + names[i] + "!") for i in reversed(temp)]

def sayBye(current, names):
    print(current + ": khodafez bacheha!")
    for index in range(names.index(current) + 1, len(names)):
        print(names[index] + ": khodafez " + current + "!")        

for name in names:
    sayHi(name, names)

for name in names:
    sayBye(name, names)
