# Input
string = input()
output = []

hold = string[0]
count = 0
for i in range(len(string)):

	if not string[i] == hold:
		output.append(hold + str(count))
		hold = string[i]		
		count = 0

	if string[i] == hold:
		count += 1

print(''.join(output) + hold + str(count))