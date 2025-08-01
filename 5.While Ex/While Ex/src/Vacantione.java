import java.util.Scanner;

public class Vacantione {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double moneyForVacation = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int daysOfSpend = 0;
        int allDays = 0;

        while (moneyForVacation > money) {
            String command = scanner.nextLine();
            double moneySaveOrSpend = Double.parseDouble(scanner.nextLine());
            allDays ++;

            if (command.equals("spend")) {
                money -= moneySaveOrSpend;
                daysOfSpend ++;
                if (money <= 0) {
                    money = 0.0;
                }
                if (daysOfSpend == 5) {
                    System.out.println("You can't save the money.");
                    System.out.println(allDays);
                    break;
                }
            } else if (command.equals("save")) {
                money += moneySaveOrSpend;
                daysOfSpend = 0;
            }
        }
        if (moneyForVacation <= money) {
            System.out.printf("You saved the money for %d days.", allDays);
        }
    }
}
