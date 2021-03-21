nums = [int(i) for i in input().split(' ')]
m = nums[0]
s = nums[1]

def getMax(m, s):
    max = ''
    for i in range(m):
        if (s >= 9):
            max += '9'
            s -= 9
        else:
            max += str(s)
            s = 0
    return max

def getMin(m, s):
    min = ''
    for i in range(m):
        if (s >= 9):
            min = min + '9'
            s -= 9
        elif i < m - 1:
            min = str(s - 1) + min
            s -= (s - 1)
        else:
            min = str(s) + min
            s = 0
    return min

def check(string):
    digits = list(str(string))
    sum = 0
    for digit in digits:
        sum += int(digit)
    if (sum == s):
        return string
    else:
        return '-1'

    
max = getMax(m, s)
max = check(max)
if (m > 1 and int(max) == 0):
    max = -1;

min = getMin(m, s)
try:
    min = int(min)
    min = check(min)
except:
    min = -1;

print(min, max)
