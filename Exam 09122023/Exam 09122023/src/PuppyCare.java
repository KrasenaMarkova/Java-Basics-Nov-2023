import java.util.Map;
import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        // Ани намира кученце, за което ще се грижи, докато се намери някой да го осинови.
        // То изяжда дневно определено количество храна. Да се напише програма,
        // която проверява дали количеството храна, което е закупено за кученцето,
        // ще е достатъчно докато кученцето бъде осиновено.

        Scanner scanner = new Scanner(System.in);

        int kgFoodForDog = Integer.parseInt(scanner.nextLine());
        String eatFood = scanner.nextLine();
        int kgToGrFoodForDog = kgFoodForDog * 1000;
        int eatFoodAllDays = 0;

        while (!eatFood.equals("Adopted")) {
            int grEatFood = Integer.parseInt(eatFood);
            eatFoodAllDays += grEatFood;


            eatFood = scanner.nextLine();
        }
        int count = Math.abs(eatFoodAllDays - kgToGrFoodForDog);

        if (kgToGrFoodForDog < eatFoodAllDays) {
            System.out.printf("Food is not enough. You need %d grams more.\n", count);
        } else {
            System.out.printf("Food is enough! Leftovers: %d grams.\n", count);
        }
    }
}
