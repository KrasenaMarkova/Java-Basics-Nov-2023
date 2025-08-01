import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {
        // Коледа наближава, а Дядо Коледа още не е готов с подаръците.
        // Той трябва да поръча материали, с които джуджетата да изработят коледните подаръци.
        // Всяка Коледа в магазина, в който Дядо Коледа пазарува има намаление,
        // което представлява някакъв процент от цената на материалите (материалите са
        // опаковъчна хартия във вид на ролки, плат също във вид на ролки и лепило в литри).
        // От конзолата се въвеждат количеството ролки хартия, ролки плат, лепило в литри и намаление в проценти.
        // Колко пари ще са необходими на дядо Коледа, за да плати сметката си,
        // ако цените на материалите в магазина са следните:
        // Опаковъчна хартия - 5.80 лв. за ролка
        // Плат - 7.20 лв. за ролка
        // Лепило - 1.20 лв. за литър

        Scanner scanner = new Scanner(System.in);

        int numberOfRollsOfPaper = Integer.parseInt(scanner.nextLine());
        int numberOfRollsOfCloth = Integer.parseInt(scanner.nextLine());
        double litersOfGlue = Double.parseDouble(scanner.nextLine());
        int percentReduction = Integer.parseInt(scanner.nextLine());

        double priceOfRollsOfPaper = numberOfRollsOfPaper * 5.80;
        double priceOfRollsOfCloth = numberOfRollsOfCloth * 7.20;
        double priceOfGlue = litersOfGlue * 1.20;

        double priceOfAllMaterials = priceOfGlue + priceOfRollsOfPaper + priceOfRollsOfCloth;
        double priceWithReduction = priceOfAllMaterials - ((priceOfAllMaterials * percentReduction) / 100);

        System.out.printf("%.3f", priceWithReduction);
    }
}
