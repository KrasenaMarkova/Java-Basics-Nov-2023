import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String serialName = scanner.nextLine();
        int durationEpizod = Integer.parseInt(scanner.nextLine());
        int durationBreak = Integer.parseInt(scanner.nextLine());

        double lunchTime = durationBreak / 8.0;
        double breakTime = durationBreak / 4.0;
        double allTime = durationBreak - lunchTime - breakTime;

        if (allTime < durationEpizod) {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    serialName,Math.ceil(durationEpizod - allTime));
        } else {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    serialName,Math.ceil(allTime - durationEpizod));
        }
    }
}
