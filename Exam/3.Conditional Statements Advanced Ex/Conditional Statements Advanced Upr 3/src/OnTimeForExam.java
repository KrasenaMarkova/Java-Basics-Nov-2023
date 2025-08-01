import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int hourArrive = Integer.parseInt(scanner.nextLine());
        int minArrive = Integer.parseInt(scanner.nextLine());

        int timeExam = (hourExam * 60) + minExam;
        int timeArrive = (hourArrive * 60) + minArrive;
        int diff = Math.abs(timeExam - timeArrive);

        if (timeExam < timeArrive) {
            System.out.println("Late");
            if (diff >= 60) {
                int hour = diff / 60;
               int minute = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, minute);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }
        } else if (timeExam == timeArrive || diff <= 30) {
            System.out.println("On time");
            if (diff != 0){
                System.out.printf("%d minutes before the start",diff);
            }
        } else {
            System.out.println("Early");
            if (diff >= 60) {
                int hour = diff / 60;
                int minute = diff % 60;
                System.out.printf("%d:%02d hours before the start", hour, minute);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }
        }
    }
}
