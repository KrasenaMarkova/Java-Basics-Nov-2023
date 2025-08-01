import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        //Ани има два домашни любимеца - куче и котка.
        // Напишете програма, която изготвя статистика за храната на домашните любимци за определен брой дни.
        // Всеки ден кучето и котката изяждат различно количество от общата им храна.
        // На всеки трети ден получават награда - бисквитки.
        // Количеството на бисквитките е 10% от общо изядената храна за деня.
        //Вашата програма трябва да отпечатва статистика за количеството бисквитки,
        // които са изяли, колко процента от първоначалното количество обща храна са изяли и
        // колко процента от изядената храна е изяло кучето и колко е изяла котката.

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double meat = Double.parseDouble(scanner.nextLine());

        double allMeat = 0.0;
        double allMeatDog = 0.0;
        double allMeatCat = 0.0;
        double biscuits = 0.0;

        for (int i = 1; i <= days; i ++) {
            int meatDog = Integer.parseInt(scanner.nextLine());
            int meatCat = Integer.parseInt(scanner.nextLine());
            double allMeatToday = meatCat + meatDog;

            if (i % 3 == 0) {
                biscuits += allMeatToday * 0.10;
            }
            allMeat += allMeatToday;
            allMeatDog += meatDog;
            allMeatCat += meatCat;
        }
        System.out.printf("Total eaten biscuits: %dgr.\n", Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.\n", (allMeat / meat) * 100);
        System.out.printf("%.2f%% eaten from the dog.\n", (allMeatDog / allMeat) * 100);
        System.out.printf("%.2f%% eaten from the cat.\n", (allMeatCat / allMeat) * 100);
    }
}
