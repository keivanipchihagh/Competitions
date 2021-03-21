count = int(input())
string = input()

# keyvoon
string1 = ('331122' * 17)[0:count]

# nezam
string2 = ('123123' * 17)[0:count]

# shir farhad
string3 = ('2123' * 25)[0:count]

def getScore(string, user):
    count = 0
    for i in range(len(string)):
        if (string[i] == user[i]):
            count += 1;
    return count;

scores = list((getScore(string, string1), getScore(string, string2), getScore(string, string3)))

print(max(scores))
if (max(scores) == scores[0]):
    print('keyvoon');
if (max(scores) == scores[1]):
    print('nezam');
if (max(scores) == scores[2]):
    print('shir farhad');
