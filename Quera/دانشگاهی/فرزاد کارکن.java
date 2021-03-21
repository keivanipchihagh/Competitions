import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    // Scanner Object
    static Scanner scanner = new Scanner(System.in);
    // Variables
    static int[] numbers;
    static List<Integer> maxInEachRowList = new ArrayList<>();

    public static void main(String[] args) {

        // Initialize
        initialize();            

        for (int i = 0; i < numbers.length; i++) {
            int max = numbers[i];

            for (int j = i; j < numbers.length; j++) {
                int tempSum = sum(i, j);
                if (tempSum > max)
                    max = tempSum;
            }
            maxInEachRowList.add(max);
        }

        int Max = maxInEachRowList.get(0);
        for (int i = 1 ; i < maxInEachRowList.size() ; i++)
            if (maxInEachRowList.get(i) > Max)
                Max = maxInEachRowList.get(i);

        int result = 0;
        for (int i = 0 ; i < numbers.length ; i++)
            if (numbers[i] >= 0) {
                result = Max;
                break;
            }
        System.out.println(result);
    }

    public static int sum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++)
            sum += numbers[i];
        return sum;
    }

    public static void initialize() {
        // Get array length
        int count = scanner.nextInt();

        // Get array items
        numbers = new int[count];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = scanner.nextInt();
    }

}