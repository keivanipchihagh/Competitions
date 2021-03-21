import java.util.Scanner;

public class Quera {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        int x4,y4;

        int x1 = Scan.nextInt();
        int y1 = Scan.nextInt();
        Scan.nextLine();
        int x2 = Scan.nextInt();
        int y2 = Scan.nextInt();
        Scan.nextLine();
        int x3 = Scan.nextInt();
        int y3 = Scan.nextInt();

        if (x1 == x2)
            x4 = x3;
        else if (x1 == x3)
            x4 = x2;
        else
            x4 = x1;

        if (y1 == y2)
            y4 = y3;
        else if (y1 == y3)
            y4 = y2;
        else
            y4 = y1;			      
			
		System.out.println(x4 + " " + y4);

    }
}