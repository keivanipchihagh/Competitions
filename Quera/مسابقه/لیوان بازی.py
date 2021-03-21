nums = [i for i in input().split(' ')]
count = int(nums[0])
current = nums[1]

nums.clear()

for i in range(count):
    nums = [i for i in input().split(' ')]
    if (nums[0] == current):
        current = nums[1]
    elif (nums[1] == current):
        current = nums[0]
print(current)
