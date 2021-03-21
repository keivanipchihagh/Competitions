import java.util.Scanner;

public class Main {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {

        String[] strings = Scan.nextLine().split(" ");
        Long[] numbers = new Long[strings.length];

        for (int i = 0; i < strings.length; i++)
            numbers[i] = Long.valueOf(strings[i]);

        numbers = bubbleSort(numbers);

        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
    }

    public static Long[] bubbleSort(Long[] items) {
        for (int i = 1; i < items.length; i++)
            for (int j = 0; j < items.length - i; j++) {
                if (items[j] > items[j + 1]) {
                    Long temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        return items;
    }
}