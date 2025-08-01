import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNUmber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i ++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > maxNUmber) {
                maxNUmber = number;
            }
            if (number < minNumber) {
                minNumber = number;
            }
        } System.out.printf("Max number: %d %n", maxNUmber);
        System.out.printf("Min number: %d", minNumber);
    }
}
