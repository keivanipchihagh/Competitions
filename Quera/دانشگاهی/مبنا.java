import java.util.Scanner;

class Main {

    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        int numberOne = Scan.nextInt();
        int numberTwo = Scan.nextInt();
        int number = Integer.valueOf(TenBaseToCustomBase(String.valueOf(numberOne), numberTwo));

        int sum1 = 0;
        for (int i = number ; i > 0 ; i /= 100) {
            sum1 += i % 10;
        }
                
        int sum = 0;
        for (int i = number ; i > 0 ; i /= 10) {
            sum += i % 10;
        }

        if (sum1 == (sum - sum1))
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    public static String TenBaseToCustomBase(String number, int targetBase) {
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
}