board = []

for i in range(7):
    board.append(list([j for j in input()]))

def exists(i, j):
    if (i >= 0 and i < len(board) and j >= 0 and j < len(board)):
        return True
    else:
        return False

def isOk(i, j):
    if (board[i][j] == 'o'):
        return True
    else:
        return False

def isEmpty(i, j):
    if (exists(i, j) and board[i][j] == '.'):
        return True
    else:
        return False

moves = 0
for i in range(7):
    for j in range(7):
        if (board[i][j] == 'o'):
            if (isEmpty(i + 2, j) and isOk(i + 1, j)):
                moves += 1
            if (isEmpty(i - 2, j) and isOk(i - 1, j)):
                moves += 1
            if (isEmpty(i, j + 2) and isOk(i, j + 1)):
                moves += 1
            if (isEmpty(i, j - 2) and isOk(i, j - 1)):
                moves += 1
print(moves)
