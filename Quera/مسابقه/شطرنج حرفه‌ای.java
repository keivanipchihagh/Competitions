import java.util.Scanner;

class Quera {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int[] numbers = new int[6];
        for (int i=0 ; i<numbers.length ; i++)
            numbers[i] = Scan.nextInt();

        System.out.print(1 - numbers[0] + " ");
        System.out.print(1 - numbers[1] + " ");
        System.out.print(2 - numbers[2] + " ");
        System.out.print(2 - numbers[3] + " ");
        System.out.print(2 - numbers[4] + " ");
        System.out.print(8 - numbers[5] + " ");
    }
}