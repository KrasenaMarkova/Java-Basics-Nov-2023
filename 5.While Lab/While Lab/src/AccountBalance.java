import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sumMoney = 0.0;

        String account = scanner.nextLine();

        while (!account.equals("NoMoreMoney")) {
            double sum = Double.parseDouble(account);

            if (sum < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            sumMoney += sum;
            System.out.printf("Increase: %.2f%n", sum);

            account = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sumMoney);
    }
}
