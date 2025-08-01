import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String country = "";
        String placeForHoliday = "";

        if (budget <= 100) {
            country = "Bulgaria";
            switch (season) {
                case "summer":
                    budget = budget * 0.30;
                    break;
                case "winter":
                    budget = budget * 0.70;
                    break;
            }
        } else if (budget <= 1000) {
            country = "Balkans";
            switch (season) {
                case "summer":
                    budget = budget * 0.40;
                    break;
                case "winter":
                    budget = budget * 0.80;
                    break;
            }
        } else {
            country = "Europe";
            budget = budget * 0.90;
        }
        if (season.equals("summer") && ! country.equals("Europe")) {
            placeForHoliday = "Camp";
        } else if (season.equals("winter") || country.equals("Europe")) {
            placeForHoliday = "Hotel";
        }
        System.out.printf("Somewhere in %s\n", country);
        System.out.printf("%s - %.2f", placeForHoliday, budget);
    }
}
