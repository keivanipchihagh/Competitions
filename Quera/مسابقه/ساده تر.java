import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

class Quera {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        double[] Numbers = new double[4];

        Numbers[0] = Scan.nextInt();
        Scan.nextLine();
        Numbers[1] = Scan.nextInt();
        Scan.nextLine();
        Numbers[2] = Scan.nextInt();
        Scan.nextLine();
        Numbers[3] = Scan.nextInt();
        Scan.nextLine();

        double sum = 0;
        for (int i=0 ; i<Numbers.length ; i++)
            sum += Numbers[i];

        double average = sum / 4;

        double product = 1;
        for (int i=0 ; i<Numbers.length ; i++)
            product *= Numbers[i];

        Arrays.sort(Numbers);

        DecimalFormat Format = new DecimalFormat("#0.000000");
        System.out.println("Sum : " + Format.format((sum)));
        System.out.println("Average : " + Format.format((average)));
        System.out.println("Product : " + Format.format((product)));
        System.out.println("MAX : " + Format.format((Numbers[Numbers.length - 1])));
        System.out.println("MIN : " + Format.format((Numbers[0])));
    }

}