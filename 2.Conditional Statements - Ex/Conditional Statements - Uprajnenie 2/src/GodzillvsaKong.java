import java.util.Scanner;

public class GodzillvsaKong {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numOfPeople = Integer.parseInt(scanner.nextLine());
        double costumePricePerPerson = Double.parseDouble(scanner.next());

        double decorMove = (budget * 10) / 100;
        double costumeTotalPrice = costumePricePerPerson * numOfPeople;

        if (numOfPeople > 150){
            costumeTotalPrice= costumeTotalPrice - ((costumeTotalPrice* 10) /100);
        }

        double result = decorMove + costumeTotalPrice;
        double ostMoney = Math.abs(budget - result);

        if ( result > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", ostMoney);
        } else if ( result <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", ostMoney);
        }


    }
}
