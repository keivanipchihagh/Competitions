import java.text.DecimalFormat;
import java.util.Scanner;

public class Quera {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        float weight = Scan.nextFloat();
        float height = Scan.nextFloat();

        DecimalFormat DF = new DecimalFormat("#0.00");
        float BMI = Float.valueOf(DF.format(weight / (height * height)));
        System.out.println(DF.format(BMI));

        if (BMI < 18.5)
            System.out.println("Underweight");
        else if (BMI >= 18.5 && BMI < 25)
            System.out.println("Normal");
        else if (BMI >= 25 && BMI < 30)
            System.out.println("Overweight");
        else if (BMI >= 30)
            System.out.println("Obese");
    }
}