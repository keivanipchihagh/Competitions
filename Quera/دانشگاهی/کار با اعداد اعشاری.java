import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {

        int count = Scan.nextInt();
        float[] numbers = new float[count];

        for (int i = 0; i < count; i++)
            numbers[i] = Scan.nextFloat();

        // Max & Min
        float max = numbers[0];
        float min = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] > max)
                max = numbers[i];
            if (numbers[i] < min)
                min = numbers[i];
        }

        // Sum
        float sum = 0;
        for (int i = 0; i < count; i++)
            sum += numbers[i];
        float average = sum / (float)count;

        DecimalFormat DF = new DecimalFormat("0.000");
        System.out.println("Max: " + DF.format(max));
        System.out.println("Min: " + DF.format(min));
        System.out.println("Avg: " + DF.format(average));
    }
}