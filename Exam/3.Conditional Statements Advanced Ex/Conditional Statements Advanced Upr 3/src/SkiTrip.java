import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dayOfStay = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String review = scanner.nextLine();

        int overNight = dayOfStay - 1;
        double totalPrice = 0.00;

        switch (typeRoom) {
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

        if (typeRoom.equals("apartment")) {
            if (overNight < 10) {
                totalPrice = totalPrice - (totalPrice * 0.30);
            } else if (overNight < 15 && overNight > 10) {
                totalPrice = totalPrice - (totalPrice * 0.35);
            } else {
                totalPrice = totalPrice - (totalPrice * 0.50);
            }
        } else if (typeRoom.equals("president apartment")) {
            if (overNight < 10) {
                totalPrice = totalPrice - (totalPrice * 0.10);
            } else if (overNight < 15 && overNight > 10) {
                totalPrice = totalPrice - (totalPrice * 0.15);
            } else {
                totalPrice = totalPrice - (totalPrice * 0.20);
            }
        }

         double finalPrice = totalPrice * overNight;
        if (review.equals("positive")) {
            finalPrice = finalPrice+ (finalPrice* 0.25);
        } else {
            finalPrice = finalPrice - (finalPrice * 0.10);
        }

        System.out.printf("%.2f", finalPrice);
    }
}
