# Inputs
information = input().split(' ')[0: 2]

# Data
table = [
    ['food', 'water', 0.5],
    ['food', 'dinner', 1.0],
    ['promote', 'judge', 50.0],
    ['promote', 'minister', 80.0],
    ['promote', 'governor', 100.0],
    ['travel', 'ground', 45.0],
    ['travel', 'sea', 58.0],
]

prices = [data[2] for data in table]
data = [[data[0], data[1]] for data in table]

# Processing
found = False

for i in range(len(data)):
	if data[i] == information:
		print(prices[i])
		found = True
		break	

if not found:
	print('10.0')