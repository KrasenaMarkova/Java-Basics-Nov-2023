import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double moneyForVacation = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());

        int daysOfSpend = 0;
        int allDays = 0;

        while (moneyForVacation > money && daysOfSpend != 5) {
            allDays ++;
            String command = scanner.nextLine();
            double moneySaveOrSpend = Double.parseDouble(scanner.nextLine());

            switch (command) {
                case "spend":
                    money -= moneySaveOrSpend;
                    daysOfSpend ++;
                    if (money < 0) {
                        money = 0.0;
                    }
                    break;
                case "save":
                    money += moneySaveOrSpend;
                    daysOfSpend = 0;
                    break;
            }
        }
        if (daysOfSpend == 5) {
            System.out.println("You can't save the money.");
            System.out.println(allDays);
        } else {
            System.out.printf("You saved the money for %d days.", allDays);
        }
    }
}
