count = int(input())
heights = []

for i in range(count):
    heights.append(int(input()))    

desiredHeight = 0
for height in heights:
    desiredHeight += height;

desiredHeight //= count;
moves = 0;

for i in range(len(heights)):
    moves += abs((desiredHeight - heights[i]))
print(moves // 2)
