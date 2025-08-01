import java.util.Scanner;

public class SuppliesforSchool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pensNum = Integer.parseInt (scanner.nextLine());
        int markersNum = Integer.parseInt(scanner.nextLine());
        int prepLiters = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double pensPrice = pensNum * 5.80;
        double markersPrice = markersNum * 7.20;
        double prepPrice = prepLiters * 1.20;

        double sum = pensPrice + markersPrice + prepPrice;

        double result = sum - (sum * (percent / 100.0));

        System.out.println(result);

    }
}
