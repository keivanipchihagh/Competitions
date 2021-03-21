nums = [int(i) for i in input().split(' ')]
n = nums[0]
k = nums[1]

index = 1;
while (True):
    if ((1 + k * index) % n == 1):
        print(index)
        break;
    index += 1;
