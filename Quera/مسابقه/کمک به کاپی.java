import java.util.Scanner;

class Quera {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int count = Scan.nextInt();
        String text = Scan.next();

        for (int i = 0 ; i < count ; i++)
            System.out.print("copy of ");
        System.out.println(text);
    }
}