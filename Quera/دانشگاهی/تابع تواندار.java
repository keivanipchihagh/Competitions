import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    // Global Variables
    static List<Integer> fibonacciNumbers = new ArrayList<>();

    public static void main(String[] args) {

        double base = Scan.nextDouble();
        int exp = Scan.nextInt();

        double multi = 1;
        for (int i = 0 ; i < exp ; i++) {
            multi *= base;
        }        

        DecimalFormat DF = new DecimalFormat("0.000");
        String result = DF.format(multi);

        System.out.println(result);
    }
}