import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        //Джеси решава, че иска да се занимава с баскетбол, но за да тренира е нужна екипировка.
        // Напишете програма, която изчислява какви разходи ще има Джеси, ако започне да тренира,
        // като знаете колко е таксата за тренировки по баскетбол за период от 1 година. Нужна екипировка:
        //• Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //• Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //• Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //• Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        Scanner scanner = new Scanner(System.in);

        int fee = Integer.parseInt(scanner.nextLine());

        double sneakers = fee - (fee * 0.40);
        double outfit = sneakers - (sneakers * 0.20);
        double priceBall = outfit / 4;
        double accessories = priceBall / 5;

        double finalPrice = fee +sneakers + outfit + priceBall + accessories;

        System.out.printf("%.2f", finalPrice);
    }
}
