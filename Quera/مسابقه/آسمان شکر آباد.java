import java.util.Scanner;

class Quera {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int rowCount = Scan.nextInt();
        int columnCount = Scan.nextInt();
        Scan.nextLine();

        int count = 0;
        for (int i = 0 ; i < rowCount ; i++) {
            String sky = Scan.nextLine();
            for (int j = 0 ; j < sky.length() ; j++)
                if (sky.charAt(j) == '*')
                    count ++;
        }
        System.out.println(count);
    }
}