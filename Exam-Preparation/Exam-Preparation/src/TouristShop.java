import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        // Времето се затопля и туристи, започват да си правят разходки високо в планината,
        // където все още сняг, като за целта те трябва да закупят нужната туристическа екипировка.
        //Вашата задача е да напишете програма, която да изчислява, стойността на екипировката,
        // както и дали определения бюджет е достатъчен или не, като се знае,
        // че в магазина има следната промоция: Всеки трети продукт е на половин цена.

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double totalCost = 0.0;
        int numberProduct = 0;
        int numProduct = 0;

        while (!input.equals("Stop")) {
            double price = Double.parseDouble(scanner.nextLine());
            numProduct ++;
             numberProduct++;

             if (numberProduct == 3) {
                 price = price / 2;
                 numberProduct = 0;
             }
            totalCost += price;
             double money = Math.abs(budget - totalCost);

             if (budget < totalCost) {
                 System.out.println("You don't have enough money!");
                 System.out.printf("You need %.2f leva!", money);
                 return;
             }
            input = scanner.nextLine();
        }
        System.out.printf("You bought %d products for %.2f leva.\n", numProduct, totalCost);
    }
}
