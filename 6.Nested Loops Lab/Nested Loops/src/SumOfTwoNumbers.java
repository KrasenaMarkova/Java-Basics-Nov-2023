import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = 0;

        for (int x1 = start; x1 <=end; x1++) {
            for (int x2 = start; x2 <=end; x2++) {
                count++;
                sum = x1 + x2;
                if (sum == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, x1, x2, magicNum );
                    return;

                }
            }
        }
        System.out.printf("%d combinations - neither equals %d", count, magicNum);
    }
}
