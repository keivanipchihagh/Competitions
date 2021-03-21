count = int(input())
letters = []
capslock = False

for i in range(count):
    entry = input()
    if (entry == "CAPS"):
        if (capslock):
            capslock = False
        else:
            capslock = True
    else:
        if (capslock):
            letters.append(entry.upper())
        else:
            letters.append(entry.lower())
print("".join(letters))
