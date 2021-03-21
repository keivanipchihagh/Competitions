nums = [int(i) for i in input().split(' ')]
n = nums[0]
m = nums[1]

nums = []

for i in range(n):
    temp = [int(i) for i in input().split(' ')]
    nums.append(temp)
    
def hasNeighbors(i, j):
    if (i > 0 and i < n - 1 and j > 0 and j < m - 1):
        return True
    else:
        return False

def checkFormation1(i, j):
    if (nums[i + 1][j] > nums[i][j] and nums[i - 1][j] > nums[i][j]):
        if (nums[i][j + 1] < nums[i][j] and nums[i][j - 1] < nums[i][j]):
            return True
    return False

def checkFormation2(i, j):
    if (nums[i + 1][j] < nums[i][j] and nums[i - 1][j] < nums[i][j]):
        if (nums[i][j + 1] > nums[i][j] and nums[i][j - 1] > nums[i][j]):
            return True
    return False

count = 0
for i in range(n):
    for j in range(m):
        if (hasNeighbors(i, j) and (checkFormation1(i, j) or checkFormation2(i, j))):
            count += 1
print(count)
