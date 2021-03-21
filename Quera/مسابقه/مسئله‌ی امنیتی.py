digits = list(input())
newDigits = []

for digit in digits:

    if (digit.isupper()):
        y = ((ord(digit) - 65) * ("".join(digits).upper().count(digit)) + 1) % 26
        newDigits.append(chr(y + 65))
    else:
        y = ((ord(digit) - 97) * ("".join(digits).lower().count(digit)) + 1) % 26
        newDigits.append(chr(y + 97))
print("".join(newDigits))
