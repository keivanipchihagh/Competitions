tmp = list(int(i) for i in input().split(' '))
x, y = tmp[0], tmp[1]
r = int(input())
tmp = list(int(i) for i in input().split(' '))
dx, dy = tmp[0], tmp[1]

if dx >= x and dx <= x + r and dy <= y and dy >= y - r:
    print("Mahdi")
else:
    print("Parsa")
