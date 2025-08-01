import java.util.Scanner;

public class SumSeconds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int timefirst = Integer.parseInt(scanner.nextLine());
        int timesecond = Integer.parseInt(scanner.nextLine());
        int timethird = Integer.parseInt(scanner.nextLine());

        int Totaltime = timefirst + timethird + timesecond;

        int minutes = Totaltime / 60;
        int seconds = Totaltime % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes,seconds);
        } else {
            System.out.printf("%d:%d", minutes,seconds);
        }
    }
}
