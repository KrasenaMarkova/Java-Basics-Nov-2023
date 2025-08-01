import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countFisherman = Integer.parseInt(scanner.nextLine());

        double priceForBoat = 0.00;

        switch (season) {
            case "Spring":
                priceForBoat = 3000.00;
                break;
            case "Summer":
            case "Autumn":
                priceForBoat = 4200.00;
                break;
            case "Winter":
                priceForBoat = 2600.00;
                break;
        }

        if (countFisherman <= 6) {
            priceForBoat = priceForBoat - (priceForBoat * 0.10);
        } else if (countFisherman <= 11) {
            priceForBoat = priceForBoat - (priceForBoat * 0.15);
        } else {
            priceForBoat = priceForBoat - (priceForBoat * 0.25);
        }

        if (countFisherman % 2 == 0 && !season.equals("Autumn")) {
            priceForBoat = priceForBoat - (priceForBoat * 0.05);
        }

        if (budget >= priceForBoat) {
            System.out.printf("Yes! You have %.2f leva left.", budget - priceForBoat);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", priceForBoat - budget);
        }
    }
}
