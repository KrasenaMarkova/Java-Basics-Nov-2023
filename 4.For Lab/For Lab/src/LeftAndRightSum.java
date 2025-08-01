import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftNumber = 0;
        int rightNumber = 0;

        for( int i = 1; i <= 2 * n; i ++) {

            int currentNum = Integer.parseInt(scanner.nextLine());

            if (i <= n) {
                leftNumber = leftNumber + currentNum;
            } else {
                rightNumber = rightNumber + currentNum;
            }
        }
        if (leftNumber == rightNumber) {
            System.out.printf("Yes, sum = %d", leftNumber);
        } else {
            int diff = Math.abs(leftNumber - rightNumber);
            System.out.printf("No, diff = %d", diff);
        }
    }
}
