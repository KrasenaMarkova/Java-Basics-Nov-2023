import java.util.Scanner;

public class FoodDelivery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegan = Integer.parseInt(scanner.nextLine());

        double pricechicken = chicken * 10.35;
        double pricefish = fish * 12.40;
        double pricevegan = vegan * 8.15;

        double allmenu = pricechicken + pricefish + pricevegan;
        double desert = allmenu * 20 / 100;
        double delivery = 2.50;
        double finalprice = allmenu + desert + delivery;

        System.out.println(finalprice);
    }
}
