# Input
ages = [int(age) for age in input().split(' ')]
length = len(ages)

# Process
ages.sort()
mean = sum(ages) / len(ages)
mode = max(set(ages), key = ages.count)
median = ages[length // 2] if (length % 2 == 1) else (ages[length // 2] + ages[length // 2 - 1]) / 2

print('{:.2f}'.format(mean), '{:.2f}'.format(median), mode, sep = '\n')