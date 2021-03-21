text = ''
line_count = int(input())
for i in range(line_count):
	text += input()

palindromes = []
words = text.split(' ')

for word in words:

	word = word.replace('.', '').replace(',', '')
	formatted_word = word.lower()

	if formatted_word == formatted_word[::-1] and word != '':
		palindromes.append(word)

if palindromes == []:
	print('No palindrome words found :(')
else:
	print('Palindrome words in the text are:', ', '.join(palindromes))