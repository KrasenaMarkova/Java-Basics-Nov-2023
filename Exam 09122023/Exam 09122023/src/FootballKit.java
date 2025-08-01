import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        // Като един истински запалянко Пепи решил да се подготви за световното първенство,
        // като си закупи екип на любимия си футболен отбор.
        // В магазина, в който пазарувал предлагали тениски, шорти, чорапи и бутонки.
        // Знае се, че цената на шортите е 75% от цената на тениските,
        // а цената на чорапите е 20% от цената на шортите.
        // Бутонките струват два пъти колкото тениската и шортите взети заедно.
        // Тъй като Пепи редовно пазарува от този магазин,
        // той има карта за отстъпка на стойност 15% от общата сума на покупката.
        // Ако сметката на Пепи е по-висока или равна на дадена сума, той получава подарък –
        // точно копие на топката от световното. Напишете програма, която изчислява дали Пепи е спечелил топката.

        Scanner scanner = new Scanner(System.in);

        double priceOfTShirt = Double.parseDouble(scanner.nextLine());
        double priceAmount = Double.parseDouble(scanner.nextLine());

        double priceOfShorts = priceOfTShirt * 0.75;
        double priceOfSocks = priceOfShorts * 0.20;
        double priceOfButtons = (priceOfTShirt + priceOfShorts) * 2;
        double totalPrice = priceOfTShirt + priceOfShorts + priceOfSocks + priceOfButtons;
        double totalPriceWithReduction = totalPrice - (totalPrice * 0.15);

        if (priceAmount <= totalPriceWithReduction) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.\n", totalPriceWithReduction);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.\n", priceAmount - totalPriceWithReduction);
        }
    }
}
