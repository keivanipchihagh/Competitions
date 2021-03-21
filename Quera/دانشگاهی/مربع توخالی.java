import java.util.Scanner;

public class Main {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {

        int bigSquare = Scan.nextInt();
        int smallSquare = Scan.nextInt();

        if (smallSquare >= bigSquare)
            System.out.println("Wrong order!");
        else if ((bigSquare - smallSquare) % 2 == 1)
            System.out.println("Wrong difference!");
        else {
            printTopDownBorder(bigSquare,smallSquare);
            printMiddleBorder(bigSquare, smallSquare);
            printTopDownBorder(bigSquare,smallSquare);
        }
    }

    public static void printTopDownBorder(int bigSquare, int smallSquare) {

        for (int j = 0 ; j < (bigSquare - smallSquare) / 2; j++) {
            for (int i = 0; i < bigSquare; i++)
                System.out.print("* ");
            System.out.print("\n");        
        }
    }

    public static void printMiddleBorder(int bigSquare, int smallSquare) {

        for (int j = 0; j < smallSquare; j++) {
            for (int i = 0; i < (bigSquare - smallSquare) / 2; i++)
                System.out.print("* ");
            for (int i = 0; i < smallSquare; i++)
                System.out.print("  ");
            for (int i = 0; i < (bigSquare - smallSquare) / 2; i++)
                System.out.print("* ");
            System.out.print("\n");
        }
    }
}