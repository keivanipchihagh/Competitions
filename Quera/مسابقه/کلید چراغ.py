count = int(input())
last = 0
result = 0

for i in range(count):
    if i == 0:
        last = int(input())
    else:
        current = int(input())
        if current != last:
            last = current
            result += 1

print(result)
