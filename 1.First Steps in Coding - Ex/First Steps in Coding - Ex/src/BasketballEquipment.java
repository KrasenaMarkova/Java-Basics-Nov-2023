import java.util.Scanner;

public class BasketballEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pricePerYear = Integer.parseInt(scanner.nextLine());

        double trainers = pricePerYear - (pricePerYear * 40 / 100.0);
        double suit = trainers - (trainers * 20 / 100.0);
        double ball = suit /4;
        double acc = ball / 5;

        double result = pricePerYear + trainers + suit + ball + acc;

        System.out.println(result);

    }
}
