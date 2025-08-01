import java.util.Scanner;

public class DemoSumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumPrime = 0;
        int sumNotPrime = 0;

        while (!input.equals("stop")){
            int num = Integer.parseInt(input);
            if (num < 0){
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0){
                    count++;
                }
            }
            if (count == 2){
                sumPrime = sumPrime + num;
            } else {
                sumNotPrime = sumNotPrime + num;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNotPrime);
    }
}
