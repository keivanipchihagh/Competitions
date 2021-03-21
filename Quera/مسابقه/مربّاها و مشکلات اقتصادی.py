nums = [int(i) for i in input().split(' ')]
n = nums[0]
k = nums[1]

nums = [int(i) for i in input().split(' ')]

total = 0;
for num in nums:
    total += num

if (total % k == 0):
    print(n - (total // k))
else:
    print(n - (total // k) - 1)
