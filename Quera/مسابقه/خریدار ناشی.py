n, m, k = [X for X in [int(x) for x in input().split(' ')]]
coors = [[int(x) for x in input().split(' ')] for i in range(k)]

if k % 2 == 1:
    print('0')
else:
    if k == n * m:
        print('-1')
    else:
        found = False
        print('1')

        for i in range(1, n + 1):
            for j in range(1, m + 1):
                if [i, j] not in coors:
                    print(i, j)
                    found = True
                    break

            if found == True:
                break