count = int(input())

breaths = [int(i) for i in input().split(' ')]
people = [int(i) for i in input().split(' ')]

total = 0;
for i in range(len(breaths)):
    total += (breaths[i] * people[i])
print(total)
