length = int(input())

matrix = [['#' if (i == 0 or j == 0 or i == length - 1 or j == length - 1 or i == j or i == length - j - 1 or (i >= j and i >= length - j)) else ' ' for i in range(length)] for j in range(length)]

# print
for row in matrix:
    for item in row:
        print(item, end = '')
    print('')
