word = input()

count = 0;
for char in word:
    if (char == 'T' or char == 'D' or char == 'L' or char == 'F'):
        count += 1
print(pow(2, count))
