import re

pattern = r"(\w)\1*"

text = input()

matcher = re.compile(pattern,re.IGNORECASE)

tokens = [match.group(0) for match in matcher.finditer(text)]

encrypted = ''

for token in tokens:

	score = 0
	for i in range(len(token)):
		score += (ord(token[i]) - 64) * (i + 1)

	encrypted += str(score)

print(encrypted)