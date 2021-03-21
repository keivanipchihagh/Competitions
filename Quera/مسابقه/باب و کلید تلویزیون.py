numbers = [int(i) for i in input().split(' ')]

channelCount = numbers[0]
startingChannel = numbers[1]
keyStrokes = numbers[2]

channels = []
for i in range(channelCount):
    channels.append(input())

currentChannelIndex = (startingChannel + keyStrokes) % channelCount
print(channels[currentChannelIndex - 1])
