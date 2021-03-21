import java.util.Scanner;

class Quera {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int num1 = Scan.nextInt();
        int num2 = Scan.nextInt();
        System.out.println(Math.abs(GCD(num1, num2)));
    }

    public static int GCD(int a, int b) { return b==0 ? a : GCD(b, a%b); }
}