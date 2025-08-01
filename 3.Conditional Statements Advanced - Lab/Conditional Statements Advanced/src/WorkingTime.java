import java.util.Scanner;

public class WorkingTime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int time = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        if (time >= 10 && time <= 18) {
            if (dayOfWeek.equals("Sunday")) {
                System.out.println("closed");
            } else {
                System.out.println("open");
            }
        } else {
            System.out.println("closed");
        }
    }
}
