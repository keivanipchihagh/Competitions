number = int(input())
fibonacci = []

def Fibonacci(number):
    fibonacci.append(0)
    fibonacci.append(1)

    for i in range(2, 100000):
        if (fibonacci[len(fibonacci) - 1] <= number):
            fibonacci.append(fibonacci[i - 1] + fibonacci[i - 2])

def getMax(number):
    Max = 0;    
    for item in fibonacci:
        if item > Max and item <= number:
            Max = item
    return Max
    
Fibonacci(number)
fibonacci.remove(1)

while (number != 0):
    Max = getMax(number)

    number -= Max;

    print(fibonacci.index(Max), end = " ")

