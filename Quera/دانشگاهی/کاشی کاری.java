import java.util.Scanner;

class Quera {

    // Scanner Objects
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int number = scanner.nextInt();
        System.out.println(fib(number));
    }

    public static int fib(int number) {
        if (number == 1) return 1;
        else if (number == 2) return 2;
        else return fib(number - 1) + fib(number - 2);
    }
}