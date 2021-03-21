import java.util.Scanner;

class Main {

    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOne = Scan.nextInt();
        int numberTwo = Scan.nextInt();
        int numberThree = Scan.nextInt();
        if (isPalindrome(convertBase(String.valueOf(numberOne), numberTwo, numberThree)))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean isPalindrome(String string) {
        String reverseString = "";
        for (int i = string.length() - 1; i >= 0; i--)
            reverseString += string.charAt(i);

        return reverseString.equals(string);
    }

    public static String convertBase(String number, int base, int targetBase) {
        return TenBaseToCustomBase(CustomBaseToTenBase(number, base), targetBase);
    }

    private static String TenBaseToCustomBase(String number, int targetBase) {
        int input = Integer.valueOf(number);
        StringBuilder SB = new StringBuilder();

        while (input / targetBase != 0) {
            SB.append(input % targetBase);
            input = input / targetBase;
        }                
        if (input / targetBase == 0)
            SB.append(input % targetBase);
        return String.valueOf(SB.reverse());
    }

    private static String CustomBaseToTenBase(String number, int base) {
        long sum = 0;
        for (int i = number.length() - 1; i >= 0; i--)
            sum += Integer.valueOf(String.valueOf(number.charAt(i))) * Math.pow(base, number.length() - 1 - i);
        return String.valueOf(sum);
    }
}