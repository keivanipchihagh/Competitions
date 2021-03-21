num1 = input()
sign = input()
num2 = input()

def concat(str1, str2):
    str2 = list(str2)
    str2[len(str2) - len(str1)] = '1'
    return str2;

if (sign == '+'):
    if (len(num1) == len(num2)):
        print(num2.replace('1', '2'))
    elif (len(num1) < len(num2)):        
        print("".join(concat(num1, num2)))
    else:
        print("".join(concat(num2, num1)))
        
else:
    print('1' + ((len(num1) + len(num2) - 2) * '0'))
