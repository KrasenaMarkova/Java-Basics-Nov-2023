import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0.0;
        String evenOrOdd = "";

        if (n2 == 0 && (operator.equals("/") || operator.equals("%"))) {
            System.out.printf("Cannot divide %d by zero", n1);
            return;
        }

        if (operator.equals("+")) {
            result = n1 + n2;
        } else if (operator.equals("-")) {
            result = n1 - n2;
        } else if (operator.equals("*")) {
            result = n1 * n2;
        } else if (operator.equals("/")) {
            result = n1 * 1.0 / n2;
        } else if (operator.equals("%")) {
            result = n1 % n2;
        }
        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            if (result % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s", n1, operator, n2, result, evenOrOdd);
        } else if (operator.equals("/")) {
            System.out.printf("%d %s %d = %.2f", n1, operator, n2, result);
        } else if (operator.equals("%")) {
            System.out.printf("%d %s %d = %.0f", n1, operator, n2, result);
        }
    }
}
