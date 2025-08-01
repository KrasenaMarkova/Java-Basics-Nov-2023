import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        // Вие сте режисьор на филма "Програмирането е забавно",
        // като имате определено време за снимки. От вас се иска да напишете програма,
        // с която ще разберете дали снимачният ден ще ви стигне да заснемете филма.
        // Снимачният ден започва с подготовка на терен, което е 15 процента от времето за снимки!
        // Филмът има определен брой сцени, които се заснемат за определено време.

        Scanner scanner = new Scanner(System.in);

       int timeForPhoto = Integer.parseInt(scanner.nextLine());
       int pLayCinema = Integer.parseInt(scanner.nextLine());
       int timeCinema = Integer.parseInt(scanner.nextLine());

       double placeCinema = timeForPhoto * 0.15;
       double finalCinema = pLayCinema * timeCinema;
       double finalTimeForCinema = placeCinema + finalCinema;


       if (timeForPhoto >= finalTimeForCinema) {
           System.out.printf("You managed to finish the movie on time! You have %d minutes left!", Math.round(timeForPhoto - finalTimeForCinema));
       } else {
           System.out.printf("Time is up! To complete the movie you need %d minutes.", Math.round(finalTimeForCinema - timeForPhoto));
       }

    }
}
