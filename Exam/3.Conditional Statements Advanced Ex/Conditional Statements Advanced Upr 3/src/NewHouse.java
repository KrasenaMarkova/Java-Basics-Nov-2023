import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int bugget = Integer.parseInt(scanner.nextLine());

        double price = 0.00;

        switch (flower) {
            case "Roses":
                price = 5.00;
                break;
            case "Dahlias":
                price = 3.80;
                break;
            case "Tulips":
                price = 2.80;
                break;
            case "Narcissus":
                price = 3.0;
                break;
            case "Gladiolus":
                price = 2.50;
                break;
        }
        double finalPrice = price * flowerCount;

        if (flower.equals("Roses") && flowerCount > 80) {
            finalPrice = finalPrice - (finalPrice * 0.10);
        }
        if (flower.equals("Dahlias") && flowerCount > 90) {
            finalPrice = finalPrice - (finalPrice * 0.15);
        }
        if (flower.equals("Tulips") && flowerCount > 80) {
            finalPrice = finalPrice - (finalPrice * 0.15);
        }
        if (flower.equals("Narcissus") && flowerCount < 120) {
            finalPrice = finalPrice + (finalPrice * 0.15);
        }
        if (flower.equals("Gladiolus") && flowerCount < 80) {
            finalPrice = finalPrice + (finalPrice * 0.20);
        }
        if (bugget >= finalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    flowerCount, flower, bugget - finalPrice);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.",
                    finalPrice - bugget);
        }
    }
}
