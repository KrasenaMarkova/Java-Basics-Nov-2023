import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {

        // да дореша задачата

    /*    Taxi - 60.00% full.
                Scary Movie - 100.00% full.
                Total tickets: 12
        66.67% student tickets.
        25.00% standard tickets.
        8.33% kids tickets.*/



                Scanner scanner = new Scanner(System.in);

        String nameMovie = scanner.nextLine();
        Map<String, Integer> movieMap = new HashMap<>();
        int seatsSold = 0; //global soldTickets for all movies
        int studentTicket = 0;
        int standardTicket = 0;
        int kidTicket = 0;

        while (!nameMovie.equals("Finish")) {

            int seats = Integer.parseInt(scanner.nextLine());
            int seatsSoldForCurrentMovie = 0;
            String typeTicket = scanner.nextLine();
            while (!typeTicket.equals("End")) {

                seats--;
                seatsSold++;
                seatsSoldForCurrentMovie++;

                switch (typeTicket) {
                    case "student":
                        studentTicket++;
                        break;
                    case "standard":
                        standardTicket++;
                        break;
                    case "kid":
                        kidTicket++;
                        break;
                }
                if (0 == seats) {
                    break;
                }

                typeTicket = scanner.nextLine();
            }

            System.out.printf("%s - %.02f%% full.\n", nameMovie, (double) seatsSold / seats * 100);
            //printMe(nameMovie, seatsSold, seats);
            nameMovie = scanner.nextLine();
        }

        int allTicket = studentTicket + standardTicket + kidTicket;

        System.out.printf("Total tickets: %d\n", allTicket);
        System.out.printf("%.2f%% student tickets.\n", (double) studentTicket / allTicket * 100);
        System.out.printf("%.2f%% standard tickets.\n", (double) standardTicket / allTicket * 100);
        System.out.printf("%.2f%% kids tickets.\n", (double) kidTicket/ allTicket * 100);
    }

    public static void printMe(String movieName, int soldTickets, int seats) {
        String percentFullStr = "%s - %.02f%% full.\n";
        int allSeats = soldTickets + seats;
        System.out.printf(percentFullStr, movieName, (double) soldTickets / allSeats * 100);
    }
}
