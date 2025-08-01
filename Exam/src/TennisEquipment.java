import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        // Световният номер едно в мъжкия тенис Новак Джокович е решил да подмени оборудването,
        // с което играе своите мачове. За целта той ви моли да напишете програма,
        // която да изчисли стойността на покупките, като се има предвид,
        // че той трябва да заплати 1/8 от цената, а останалите 7/8 трябва да бъдат заплатени
        // от неговите спонсори. Джокович иска да закупи n на брой тенис ракети и m чифта маратонки,
        // както и друга екипировка, на стойност 20% от общата цена на закупените ракети и маратонки.

        Scanner scanner = new Scanner(System.in);

        double priceOfTennisRackets = Double.parseDouble(scanner.nextLine());
        int numberOfTennisRackets = Integer.parseInt(scanner.nextLine());
        int numberOfSneakers = Integer.parseInt(scanner.nextLine());

        double finalPriceOfTennisRackets = priceOfTennisRackets * numberOfTennisRackets;
        double priceOfSneakers = (priceOfTennisRackets / 6) * numberOfSneakers;
        double priceOfEquipment = (priceOfSneakers + finalPriceOfTennisRackets) * 0.20;
        double allPrice = priceOfEquipment + priceOfSneakers + finalPriceOfTennisRackets;

        double priceOfDjokovic = allPrice / 8;
        double priceOfSponsors = allPrice * 7 / 8;

        System.out.printf("Price to be paid by Djokovic %.0f\n", (Math.floor(priceOfDjokovic)));
        System.out.printf("Price to be paid by sponsors %.0f\n", (Math.ceil(priceOfSponsors)));
    }
}
