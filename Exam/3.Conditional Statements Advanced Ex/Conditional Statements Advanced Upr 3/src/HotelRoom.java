import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceForStudio = 0.00;
        double priceForApartament = 0.00;

        switch (month) {
            case "May":
            case "October":
                priceForStudio = 50.00;
                priceForApartament = 65.00;
                break;
            case "June":
            case "September":
                priceForStudio = 75.20;
                priceForApartament = 68.70;
                break;
            case "July":
            case "August":
                priceForStudio = 76.00;
                priceForApartament = 77.00;
                break;
        }
        if ((month.equals("May") || month.equals("October")) && (nights > 7 && nights < 14)) {
            priceForStudio = priceForStudio - (priceForStudio * 0.05);
        } else if ((month.equals("May") || month.equals("October")) && nights > 14) {
            priceForStudio = priceForStudio - (priceForStudio * 0.30);
        } else if ((month.equals("June") || month.equals("September")) && nights > 14) {
            priceForStudio = priceForStudio - (priceForStudio * 0.20);
        }
        if (nights > 14) {
            priceForApartament = priceForApartament - (priceForApartament * 0.10);
        }

        System.out.printf("Apartment: %.2f lv.\n", nights * priceForApartament);
        System.out.printf("Studio: %.2f lv.", nights * priceForStudio);
    }
}
