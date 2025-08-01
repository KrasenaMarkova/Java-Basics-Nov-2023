import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 1; i <= n; i ++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) {
                sumOdd = sumOdd + number;
            } else {
                sumEven = sumEven + number;
            }
        }
        if (sumEven == sumOdd) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEven);
        } else {
            int diff = Math.abs(sumOdd - sumEven);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
