import java.util.Scanner;

public class Main {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {

        int rowCount = (2 * Scan.nextInt()) + 1;

        int spaceCount = (rowCount - 1) / 2;
        int starCount = 1;
        for (int i = 0; i < (rowCount - 1) / 2; i++) {
            print(spaceCount, starCount);
            spaceCount--;
            starCount += 2;
        }
        
        for (int i = 0; i < rowCount; i++)
            System.out.print("*");
        System.out.print("\n");

        starCount = rowCount - 2;
        spaceCount = 1;
        for (int i = 0 ; i < (rowCount - 1) / 2; i++) {
            print(spaceCount, starCount);
            spaceCount++;
            starCount -= 2;
        }                
    }

    public static void print(int spaceCount, int starCount) {
        for (int j = 0; j < spaceCount; j++)
            System.out.print(" ");
        for (int j = 0; j < starCount; j++)
            System.out.print("*");
        for (int j = 0; j < spaceCount; j++)
            System.out.print(" ");
        System.out.print("\n");
    }
}