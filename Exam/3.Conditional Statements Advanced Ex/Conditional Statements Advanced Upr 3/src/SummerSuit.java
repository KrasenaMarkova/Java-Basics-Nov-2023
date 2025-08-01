import java.util.Scanner;

public class SummerSuit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int degrease = Integer.parseInt(scanner.nextLine());
        String partOfDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (partOfDay.equals("Morning")) {
            if (degrease >= 10 && degrease <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (degrease > 18 && degrease <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        } else if (partOfDay.equals("Afternoon")) {
            if (degrease >= 10 && degrease <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degrease > 18 && degrease <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        } else if (partOfDay.equals("Evening")) {
            outfit = "Shirt";
            shoes = "Moccasins";
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrease, outfit, shoes);
    }
}
