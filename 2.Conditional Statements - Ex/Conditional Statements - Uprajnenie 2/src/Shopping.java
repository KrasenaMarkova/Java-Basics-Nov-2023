import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budjet = Double.parseDouble(scanner.nextLine());
        int cards = Integer.parseInt(scanner.nextLine());
        int procesor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double priceCards = cards * 250;
        double priceProcesor = procesor * (priceCards * 35) / 100;
        double priceRam =ram * (priceCards * 10) / 100;

        double allPrice = priceCards +priceRam + priceProcesor;

        if (cards > procesor) {
            allPrice =allPrice - ((allPrice * 15) / 100);
        }
        if (allPrice > budjet) {
            System.out.printf("Not enough money! You need %.2f leva more!",
                    allPrice - budjet);
        } else {
            System.out.printf("You have %.2f leva left!",
                    budjet - allPrice);
        }
    }
}
