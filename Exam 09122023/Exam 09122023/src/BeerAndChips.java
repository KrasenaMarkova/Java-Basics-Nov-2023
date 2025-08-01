import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        // По време на мач Пепи решава да си купи бира и чипс от магазинчето в стадиона.
        // Вашата задача е да напишете програма, с която ще разберете дали има необходимите пари
        // и дали ще успее да си закупи съответните неща. Цената на една бира е 1.20 лв.,
        // а цената на един пакет чипс е равна на 45% от общата стойност на закупените бири.
        // Общата цена на чипса да се закръгли до по-голямо число.

        Scanner scanner = new Scanner(System.in);

        String footballFan = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int bottleOfBeer = Integer.parseInt(scanner.nextLine());
        int packetOfChips = Integer.parseInt(scanner.nextLine());

        double priceOfBeer = bottleOfBeer * 1.20;
        double priceOfChips = Math.ceil(packetOfChips * (priceOfBeer * 0.45));
        double finalPrice = priceOfBeer + priceOfChips;

        double count = Math.abs(finalPrice - budget);

        if (budget < finalPrice) {
            System.out.printf("%s needs %.2f more leva!\n", footballFan, count);
        } else {
            System.out.printf("%s bought a snack and has %.2f leva left.\n", footballFan, count);
        }
    }
}
