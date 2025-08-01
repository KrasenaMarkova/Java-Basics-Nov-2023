import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());

        for (int i = x1; i <= x2 ; i++) {
            int currentNum = i;
            int sumEven = 0;
            int sumOdd = 0;

            for (int j = 6; j > 0; j--) {
                int lastDigit = currentNum % 10;
                currentNum /= 10;

                if (j % 2 == 0) {
                    sumEven += lastDigit;
                } else {
                    sumOdd += lastDigit;
                }
                }
                if (sumOdd == sumEven) {
                System.out.print(i + " ");
            }
        }
    }
}
