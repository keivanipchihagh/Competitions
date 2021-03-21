count = int(input())
nums = [int(i) for i in input().split(' ')]

Max = nums[0]
for item in nums:
    if (item > Max):
        Max = item

print(nums.index(Max) + 1)
