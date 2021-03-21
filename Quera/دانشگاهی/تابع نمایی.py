x = int(input())
n = int(input())

total = 1.0
last = 1.0

for i in range(1, n):
    phrase = last * x / i
    last = phrase
    total += phrase

print('{0:.3f}'.format(total))
