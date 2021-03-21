count = int(input())
password = input()
codes = []

for i in range(count):
    codes.append(input())

total = 0
for i in range(count):
    index = codes[i].index(password[i])
    if (index < len(codes[i]) - index):
        total += index
    else:
        total += len(codes[i]) - index
print(total)
