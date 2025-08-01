import java.util.Scanner;

public class SwimRecord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance= Double.parseDouble(scanner.nextLine());
        double timeSeconds = Double.parseDouble(scanner.nextLine());

        double allSwimming = Math.floor (distance / 15) * 12.5;
        double lastTime = (distance * timeSeconds) + allSwimming;

        if (lastTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",
                    lastTime);
        } else {
             System.out.printf("No, he failed! He was %.2f seconds slower.",
                     lastTime - record);
        }
    }
}
