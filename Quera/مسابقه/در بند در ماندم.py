count = int(input())
people = []
for i in range(count):
    people.append(input())

def dialog(index):

    if (index != 0):    
        print(people[index], " to ", people[index - 1], ": dar manand?", sep = "")
        index -= 1
        dialog(index)
        
        print(people[index], " to ", people[index + 1], ": dar manand.", sep = "")

for index in range(count - 1):
    print(people[index], " to ", people[index + 1], ": ke ba in dar agar dar bande dar manand, dar manand.", sep = "")
    dialog(index + 1)
