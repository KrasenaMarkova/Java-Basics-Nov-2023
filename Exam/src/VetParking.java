import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        // Деси трябва да заведе котката си на ветеринар, но паркингът се заплаща.
        // Напишете програма, която пресмята колко общо трябва да се плати за престоя на
        // колата на Деси на паркинга. Паркингът е различен от останалите и има разнообразен ценоразпис.
        // За всеки четен ден и нечетен час, паркингът таксува 2.50 лева. Във всеки нечетен ден и
        // четен час таксата е 1.25 лева, във всички останали случаи се заплаща 1 лев.
        // Таксуването става на всеки изминал час от деня. Всеки един от изходите трябва да
        // бъде закръглен до втория знак след десетичната запетая.

        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double allPrice = 0.0;

        for (int i = 1; i <= days; i++) {
            double dayPrice = 0.0;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    dayPrice += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    dayPrice += 1.25;
                } else {
                    dayPrice += 1;
                }
            }
            allPrice += dayPrice;
            System.out.printf("Day: %s - %.2f leva\n", i, dayPrice);
            
        }
        System.out.printf("Total: %.2f leva\n", allPrice);

    }
}
