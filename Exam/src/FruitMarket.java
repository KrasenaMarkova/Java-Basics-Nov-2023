import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        //Мария решава да мине на диета и отива до близкия пазар, за да купи ягоди,
        // банани, портокали и малини. На конзолата се въвежда цената на ягодите в лв./кг.
        // и количеството на бананите, портокалите, малините и ягодите, които трябва да закупи.
        // Да се напише програма, която пресмята колко пари са ѝ необходими за да плати сметката,
        // като знаете, че:
        //• цената на малините е на половина по-ниска от тази на ягодите;
        //• цената на портокалите е с 40% по-ниска от цената на малините;
        //• цената на бананите е с 80% по-ниска от цената на малините.

        Scanner scanner = new Scanner(System.in);

        double priceStrawberry = Double.parseDouble(scanner.nextLine());
        double kgBanana = Double.parseDouble(scanner.nextLine());
        double kgOrange = Double.parseDouble(scanner.nextLine());
        double kgRaspberry = Double.parseDouble(scanner.nextLine());
        double kgStrawberry = Double.parseDouble(scanner.nextLine());

        double priceRaspberry = priceStrawberry / 2;
        double priceOrange = priceRaspberry - (priceRaspberry * 0.40);
        double priceBanana =  priceRaspberry - (priceRaspberry * 0.80);

        double finalPriceStrawberry = kgStrawberry * priceStrawberry;
        double finalPriceRaspberry = kgRaspberry * priceRaspberry;
        double finalPriceOrange = kgOrange * priceOrange;
        double finalPriceBanana = kgBanana * priceBanana;

        System.out.printf("%.2f", finalPriceBanana + finalPriceOrange + finalPriceRaspberry + finalPriceStrawberry);

    }
}
