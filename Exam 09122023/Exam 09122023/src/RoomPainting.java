import java.util.Scanner;

public class RoomPainting {
    public static void main(String[] args) {
        //Малък екип от хора има за задача да пребоядиса голямо помещение.
        // За да постигнат това са им необходими: боя, тапети, ръкавици и четки,
        // които те ще поръчат онлайн. Боята се продава в кутии, а тапетите под форма на ролки.
        // Известно е, че цената на една кутия боя е 21.50 лв., а цената на една ролка тапет е 5.20 лв.
        // Броят нужни ръкавици представлява 35% от броя на ролките тапети, закръглени нагоре,
        // а броят на нужните четки 48% от броя на кутиите боя, закръглени надолу.
        // Вашата задача е да изчислите доставката на всички необходими продукти,
        // която представлява 1 / 15 от общата цена на продуктите.

        Scanner scanner = new Scanner(System.in);

        int boxWithPaint = Integer.parseInt(scanner.nextLine());
        int numberOfWallpaperRolls = Integer.parseInt(scanner.nextLine());
        double priceOfOneGloves = Double.parseDouble(scanner.nextLine());
        double priceOfOneBrush = Double.parseDouble(scanner.nextLine());

        double priceOfPaint = boxWithPaint * 21.50;
        double priceOfWallpaper = numberOfWallpaperRolls * 5.20;
        double priceOfGlove = priceOfOneGloves * (Math.ceil(numberOfWallpaperRolls * 0.35));
        double priceOfBrush = priceOfOneBrush * (Math.floor(boxWithPaint * 0.48));

        double totalCost = priceOfPaint + priceOfWallpaper + priceOfGlove + priceOfBrush;
        double transport = totalCost / 15;

        System.out.printf("This delivery will cost %.2f lv.\n", transport);

    }
}
