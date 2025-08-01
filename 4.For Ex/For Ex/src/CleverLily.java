import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        for (int i = 1; i <= age; i ++) {
            if (i % 2 == 0) {
               sum = sum + (((double) i / 2) * 10) - 1;
            } else {
                sum += priceToy;
            }
        }
        if (sum >= priceWashingMachine) {
            System.out.printf("Yes! %.2f", sum - priceWashingMachine);
        } else {
            System.out.printf("No! %.2f", priceWashingMachine - sum);
        }
    }
}
