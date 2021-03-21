n, m = [x for x in  [int(x) for x in input().split(' ')]]

def get_row(m, x_first):
    result = ''
    for i in range(3):
        if x_first == True:
            result += ('X' * m)
            x_first = False
        else:
            result += ('.' * m)
            x_first = True

    return result

x_first = True

for i in range(1, 3 * n + 1):

    print(get_row(m, x_first))

    if i % n == 0:
        x_first = True if (x_first == False) else False
