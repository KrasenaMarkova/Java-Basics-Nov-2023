import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        //В най-голямата компютърна зала в България цените варират поради голямата посещаемост.
        // Таксите на залата са в зависимост от това дали е ден или нощ, както и месецът,
        // в който се посещава залата. Цените са следните:
        // Март до Май Юни до Август Ден 10.50 лв/ч 12.60 лв/ч Нощ 8.40 лв/ч 10.20 лв/ч
        //Предлагат се и следните отстъпки в следната последователност:
        //• За група от четирима или повече човека, цената на човек се намаля с 10%
        //• За 5 или повече часа прекарани, цената на човек се намаля с 50%
        //Да се напише програма, която изчислява цената на човек за час и общата сума.

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int numberOfPeopleOfGroup = Integer.parseInt(scanner.nextLine());
        String partOfDay = scanner.nextLine();

        double priceForHour = 0.0;

        switch (partOfDay) {
            case "day":
                if (month.equals("march") || month.equals("april") || month.equals("may")) {
                    priceForHour = 10.50;
                } else {
                    priceForHour = 12.60;
                }
                break;
            case "night":
                if (month.equals("march") || month.equals("april") || month.equals("may")) {
                    priceForHour = 8.40;
                } else {
                    priceForHour = 10.20;
                }
                break;
        }
        if (numberOfPeopleOfGroup >= 4) {
            priceForHour = priceForHour - (priceForHour * 0.10);
        }
        if (hours >= 5) {
            priceForHour = priceForHour - (priceForHour * 0.50);
        }
        double totalCost = priceForHour * numberOfPeopleOfGroup * hours;

        System.out.printf("Price per person for one hour: %.2f\n", priceForHour);
        System.out.printf("Total cost of the visit: %.2f\n", totalCost);
    }
}
