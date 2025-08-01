import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumNUmber = 0;

        while (sumNUmber < n) {
            int nextN = Integer.parseInt(scanner.nextLine());
            sumNUmber += nextN;
        }
        System.out.println(sumNUmber);
    }
}
