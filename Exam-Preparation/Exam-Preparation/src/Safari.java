import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        // Симона и Светлин ще ходят на почивка в Африка и искат да отидат на сафари.
        // Понеже за делничните дни вече имат планове, решават, че ще отидат събота или неделя.
        // Напишете програма, която изчислява колко ще им струва ходенето на сафари и
        // дали бюджетът им ще им стигне да отидат, като имате предвид следното:
        //• Цената на един литър гориво е 2.10 лв.
        //• Цената за екскурзовод е 100лв.
        //• В зависимост от деня има отстъпки от общата цена - за събота 10%, а за неделя 20%

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double litreFuel = Double.parseDouble(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        double priceFuel = litreFuel * 2.10;
        double priceTravel = priceFuel + 100;

        switch (dayOfWeek) {
            case "Saturday":
                priceTravel = priceTravel - (priceTravel * 10) / 100;
                break;
            case "Sunday":
                priceTravel = priceTravel - (priceTravel * 20) / 100;
                break;
        }
        double money = Math.abs(budget - priceTravel);
        if (budget >= priceTravel) {
            System.out.printf("Safari time! Money left: %.2f lv.\n", money);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.\n",money);
        }
    }
}
