def GCD(a, b):
    return a if (b == 0) else GCD(b, a % b)

count = int(input())

nums = []
for i in range(count):
    nums.append(int(input()))

while len(nums) != 1:
    nums.append((nums[0] * nums[1]) // GCD(nums[0], nums[1]))
    nums = nums[2:]

print((nums[0] % 30) + 1)