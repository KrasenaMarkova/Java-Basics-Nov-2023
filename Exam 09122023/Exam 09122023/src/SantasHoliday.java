import java.util.Scanner;

public class SantasHoliday {

    public static void main(String[] args) {
        // Всяка година Дядо Коледа избира различни дестинации за почивка.
        // Тази година той решава да прекара почивните си дни в България.
        // Неговите верни приятели – джуджетата, му предлагат да се настани в един от най-престижните хотели,
        // а именно "Четири сезона". По време на престоя си там,
        // той трябва да избере между следните видове помещения, със следните цени за престой:
        //• "room for one person" – 18.00 лв за нощувка
        //• "apartment" – 25.00 лв за нощувка
        //• "president apartment" – 35.00 лв за нощувка
        //Според броят на дните, в които Дядо Коледа ще остане в хотела (пример: 11 дни = 10 нощувки)
        // и видът на помещението, което ще избере, той може да ползва различно намаление.
        // Намаленията спрямо дните и помещението са както следва:
        // вид помещение по-малко от 10 дни между 10 и 15 дни повече от 15 дни
        //room for one person
        //не ползва намаление
        //не ползва намаление
        //не ползва намаление
        //apartment
        //30% от крайната цена
        //35% от крайната цена
        //50% от крайната цена
        //president apartment
        //10% от крайната цена
        //15% от крайната цена
        //20% от крайната цена
        //След престоя си в хотела, оценката на Дядо Коледа за услугите на хотела може да е
        // позитивна (positive) или негативна (negative).
        // Ако оценката му е позитивна, към цената с вече приспаднатото намаление Дядо Коледа добавя 25% към нея.
        // Ако оценката му е негативна приспада от цената 10%.

        Scanner scanner = new Scanner(System.in);

        int daysOfStay = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String review = scanner.nextLine();

        int overNights = daysOfStay - 1;
        double totalPrice = 0.0;

        switch (typeOfRoom) {
            case "room for one person":
                totalPrice = 18.00;
                break;
            case "apartment":
                totalPrice = 25.00;
                break;
            case "president apartment":
                totalPrice = 35.00;
                break;
        }

        if (typeOfRoom.equals("apartment")) {
            if (overNights < 10) {
                totalPrice = totalPrice - (totalPrice * 0.30);
            } else if (overNights < 15 && overNights > 10) {
                totalPrice = totalPrice - (totalPrice * 0.35);
            } else {
                totalPrice = totalPrice - (totalPrice * 0.50);
            }
        } else if (typeOfRoom.equals("president apartment")) {
            if (overNights < 10) {
                totalPrice = totalPrice - (totalPrice * 0.10);
            } else if (overNights < 15 && overNights > 10) {
                totalPrice = totalPrice - (totalPrice * 0.15);
            } else {
                totalPrice = totalPrice - (totalPrice * 0.20);
            }
        }

        double finalPrice = totalPrice * overNights;

        if (review.equals("positive")) {
            finalPrice = finalPrice+ (finalPrice* 0.25);
        } else {
            finalPrice = finalPrice - (finalPrice * 0.10);
        }
        System.out.printf("%.2f", finalPrice);
    }
}
