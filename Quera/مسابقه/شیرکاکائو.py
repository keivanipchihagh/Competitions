count = int(input())
people = list(int(i) for i in input().split(' '))
total = 0

people.reverse()
for person in people:
    total += person
    if total < 0:
        total = 0

print(total)
