import java.util.Scanner;

public class Main {

    // Scanner Object
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {

        int count = Scan.nextInt();
        int[][] matrix = new int[count][2];
        
        for (int i = 0 ; i < count ; i++) {
            matrix[i][0] = Scan.nextInt();
            matrix[i][1] = Scan.nextInt();
            Scan.nextLine();
        }

        int x = 0;
        int y = 0;
        int counter = 0;
        int i = 0;

        while(true) {

            if (x<= 5000 && y<= 5000) {

                if (x == matrix[i][0] && y == matrix[i][1]) {
                    System.out.println(counter);
                    x = 0;
                    y = 0;
                    counter = 0;
                    i++;
                }

                switch (counter % 4) {
                    case 0: x++; y++;
                        break;
                    case 1: x++; y--;
                        break;
                    case 2: x++; y++;
                        break;
                    case 3: x--; y++;
                        break;
                }            
                counter++;
            } else {
                System.out.println("-1");
                x = 0;
                y = 0;
                counter = 0;
                i++;
            }     
            
            if (count == i)
                break;
        }
    }
}