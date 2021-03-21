bounds = [int(i) for i in input().split(' ')]
mineCount = int(input())

locations = []
for i in range(mineCount):
    locations.append([int(i) - 1 for i in input().split(' ')])

board = [['.' for j in range(bounds[1])] for i in range(bounds[0])]

for location in locations:
    board[location[0]][location[1]] = '*'

def getBombCount(i, j):
    count = 0
    if (j - 1 >= 0 and board[i][j - 1] == '*'):
        count += 1
    if (j + 1 < bounds[1] and board[i][j + 1] == '*'):
        count += 1
        
    if (i - 1 >= 0 and board[i - 1][j] == '*'):
        count += 1
    if (i + 1 < bounds[0] and board[i + 1][j] == '*'):
        count += 1
        
    if (i - 1 >= 0 and j - 1 >= 0 and board[i - 1][j - 1] == '*'):
        count += 1
    if (i - 1 >= 0 and j + 1 < bounds[1] and board[i - 1][j + 1] == '*'):
        count += 1
        
    if (i + 1 < bounds[0] and j - 1 >= 0 and board[i + 1][j - 1] == '*'):
        count += 1
    if (i + 1 < bounds[0] and j + 1 < bounds[1] and board[i + 1][j + 1] == '*'):
        count += 1
    
    return count

for i in range(bounds[0]):
    for j in range(bounds[1]):
        if (board[i][j] != '*'):
            board[i][j] = getBombCount(i, j)
        print(str(board[i][j]) + " ", end = "")
    print()
