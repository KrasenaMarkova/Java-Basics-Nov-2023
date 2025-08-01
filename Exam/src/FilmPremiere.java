import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        // За предстояща премиера на три известни продукции, местно кино ви наема да напишете софтуер,
        // който да изчислява цената, която клиентите трябва да заплатят, според филма и пакета, който са избрали.
        // John Wick	Star Wars	Jumanji
        //Напитка	12 лв./бр.	18 лв. /бр.	9 лв. /бр.
        //Пуканки	15 лв. /бр.	25 лв. /бр.	11 лв. /бр.
        //Меню	19 лв. /бр.	30 лв. /бр.	14 лв. /бр.
        //Напишете програма, която изчислява цената, която трябва да се заплати,
        // като имате в предвид следните отстъпки:
        //•	При избран филм "Star Wars" и закупени поне четири билета, има 30% семейна отстъпка.
        //•	При избран филм "Jumanji" и закупени точно два билета, има 15% отстъпка за двама.

        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();
        String menu = scanner.nextLine();
        int numTickets = Integer.parseInt(scanner.nextLine());

        double priceTickets = 0;

        if (film.equals("John Wick")) {
            switch (menu) {
                case "Drink":
                    priceTickets = numTickets * 12.0;
                    break;
                case "Popcorn":
                    priceTickets = numTickets * 15.0;
                    break;
                case "Menu":
                    priceTickets = numTickets * 19.0;
                    break;
            }
        } else if (film.equals("Star Wars")) {
            if (numTickets >= 4) {
                switch (menu) {
                    case "Drink":
                        priceTickets = numTickets * 18;
                        priceTickets = priceTickets - (priceTickets * 0.30);
                        break;
                    case "Popcorn":
                        priceTickets = numTickets * 25;
                        priceTickets = priceTickets - (priceTickets * 0.30);
                        break;
                    case "Menu":
                        priceTickets = numTickets * 30;
                        priceTickets = priceTickets - (priceTickets * 0.30);
                        break;
                }
            } else {
                switch (menu) {
                    case "Drink":
                        priceTickets = numTickets * 18;
                        break;
                    case "Popcorn":
                        priceTickets = numTickets * 25;
                        break;
                    case "Menu":
                        priceTickets = numTickets * 30;
                        break;
                }
            }
        } else if (film.equals("Jumanji")) {
            if (numTickets == 2) {
                switch (menu) {
                    case "Drink":
                        priceTickets = numTickets * 9;
                        priceTickets = priceTickets - (priceTickets * 0.15);
                        break;
                    case "Popcorn":
                        priceTickets = numTickets * 11;
                        priceTickets = priceTickets - (priceTickets * 0.15);
                        break;
                    case "Menu":
                        priceTickets = numTickets * 14;
                        priceTickets = priceTickets - (priceTickets * 0.15);
                        break;
                }
            } else {
                switch (menu) {
                    case "Drink":
                        priceTickets = numTickets * 9;
                        break;
                    case "Popcorn":
                        priceTickets = numTickets * 11;
                        break;
                    case "Menu":
                        priceTickets = numTickets * 14;
                        break;
                }
            }

        }
        System.out.printf("Your bill is %.2f leva.", priceTickets);
    }
}
