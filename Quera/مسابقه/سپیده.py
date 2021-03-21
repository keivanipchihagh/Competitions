nums = [int(i) for i in input().split(' ')]
n = nums[0]
m = nums[1]

if (n > m):
    if (n % m == 0):
        print(n // m)
    else:
        print(n // m + 1)
else:
    print('1')
