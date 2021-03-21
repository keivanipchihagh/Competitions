nums = [int(i) for i in input().split(' ')]
N = nums[0]
M = nums[1]

Map = {}
for i in range(N):
    temp = [i for i in input().split(' ')]
    Map[temp[0]] = temp[1]

words = [i for i in input().split(' ')]

string = ""
for word in words:
    if (word in Map):
        string += (Map[word] + " kachal! ")
    else:
        string += "kachal! "
print(string)
