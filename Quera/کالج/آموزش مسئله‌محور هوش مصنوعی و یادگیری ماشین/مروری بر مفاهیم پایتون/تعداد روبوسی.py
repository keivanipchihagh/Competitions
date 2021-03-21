rooms = {}
kisses_current = []

# Input
room_count = int(input())

for i in range(room_count):
	room = input()

	if room in rooms.keys():

		count = rooms[room][0] + 1

		if count == 1:
			kisses = 1
		else:
			kisses = count * (count - 1) // 2

		rooms[room][0] = count
		rooms[room][1] += kisses
		kisses_current.append(rooms[room][1])
	else:
		rooms[room] = [1, 0]
		kisses_current.append(0)

for current in kisses_current:
	print(current)