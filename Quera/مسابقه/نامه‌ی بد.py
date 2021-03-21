message = list(input())
letters = set(message)
isBad = False

for letter in letters:
    count = 0
    for item in message:
        if (item == letter):
            count += 1
    if (count % 2 == 1):
        isBad = True
if (isBad):
    print("bad")
else:
    print("khoob")
