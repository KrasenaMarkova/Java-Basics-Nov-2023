import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        // Туристическа фирма разпродава финални екскурзионни пакети за края на годината.
        // Напишете програма, която да изчислява, печалбата от разпродажбата и
        // дали са продадени всички пакети или не, като знаете първоначалния брой екскурзии и техните цени.
        // Фирмата предлага два вида екскурзии – море ("sea") на цена 680 лева и планина
        // ("mountain") на цена 499 лева. При избор на даден пакет, към общата сума се добавя съответната цена.
        // При избор на пакет, който вече не е наличен (броят му е равен на 0),
        // не трябва да се добавя към общата цена.

        Scanner scanner = new Scanner(System.in);

        int numberOfSeaExcursions = Integer.parseInt(scanner.nextLine());
        int numberOfMountainExcursions = Integer.parseInt(scanner.nextLine());

        String typeOFExcursion = scanner.nextLine();
        int profit = 0;

        while (!typeOFExcursion.equals("Stop")) {

                switch (typeOFExcursion) {
                    case "sea":

                        if (numberOfSeaExcursions > 0){
                            profit += 680;
                            numberOfSeaExcursions--;
                        }
                        break;
                    case "mountain":

                        if (numberOfMountainExcursions > 0) {
                            profit += 499;
                            numberOfMountainExcursions--;
                        }
                        break;
                }
            if (numberOfMountainExcursions == 0 && numberOfSeaExcursions == 0) {
                break;
            }
            typeOFExcursion = scanner.nextLine();
        }

        if (numberOfMountainExcursions == 0 && numberOfSeaExcursions == 0) {
            System.out.println("Good job! Everything is sold.");
            System.out.printf("Profit: %d leva.\n", profit);
        } else {

            System.out.printf("Profit: %d leva.\n", profit);
        }
    }
}
