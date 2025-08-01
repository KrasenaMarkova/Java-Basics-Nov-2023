import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        int maxNumber = Integer.MIN_VALUE;

        while (!n.equals("Stop")) {
            int num = Integer.parseInt(n);

            if (maxNumber < num) {
                maxNumber = num;
            }
            n = scanner.nextLine();

        }
        System.out.println(maxNumber);
    }
}
