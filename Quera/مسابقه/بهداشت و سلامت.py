score = int(input())
days = int(input())

if days == 0:
    score = 20
elif days != 7:
    score -= days
    if score < 0:
        score = 0

print(score)
