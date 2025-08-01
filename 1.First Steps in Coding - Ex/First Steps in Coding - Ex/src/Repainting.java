import java.util.Scanner;

public class Repainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int razr = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = (paint + (paint* 10/100.0)) * 14.50;
        double razrPrice = razr * 5;

        double sum = nylonPrice + paintPrice + razrPrice + 0.40;
        double workers = hours * ( sum * 30 / 100.0);

        double result = sum + workers;

        System.out.println(result);


    }
}
