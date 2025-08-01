import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cow = Integer.parseInt(scanner.nextLine());

        int totalSuits = rows * cow;
        double price = 0.00;

        if (projection.equals("Premiere")) {
            price = 12.00;
        } else if (projection.equals("Normal")) {
            price = 7.50;
        } else if (projection.equals("Discount")) {
            price = 5.00;
        }

        System.out.printf("%.2f leva",totalSuits * price);
    }
}
