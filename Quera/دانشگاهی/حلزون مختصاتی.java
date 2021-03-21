import java.util.Scanner;

public class Main {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        int number = Scan.nextInt();

        int x = 0;
        int y = 0;
        int counter = 1;    // Step counter
        int step = 1;   // Pair coordinates

        while (true) {

            int multi;
            if (step % 2 == 0)            
                multi = -1;
            else
                multi = 1;

            // first half
            x += (step * multi);
            y += 0;            

            counter++;
            if (number == counter) {
                System.out.println(x + " " + y);
                break;
            }

            // second half
            x += 0;
            y += (step * multi);            

            counter++;
            if (number == counter) {
                System.out.println(x + " " + y);
                break;
            }

            step++;
        }

    }
}