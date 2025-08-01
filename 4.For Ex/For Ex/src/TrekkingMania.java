import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;
        int totalPeople = 0;

        for (int i = 1; i <= group; i ++) {
            int numberOfPeople = Integer.parseInt(scanner.nextLine());
            totalPeople += numberOfPeople;

            if (numberOfPeople <= 5) {
                p1 += numberOfPeople;
            } else if (numberOfPeople <= 12) {
                p2 += numberOfPeople;
            } else if (numberOfPeople <= 25) {
                p3 += numberOfPeople;
            } else if (numberOfPeople <= 40) {
                p4 += numberOfPeople;
            } else {
                p5 += numberOfPeople;
            }
        }
        System.out.printf("%.2f%%%n", p1 * 100.0 / totalPeople);
        System.out.printf("%.2f%%%n", p2 * 100.0 / totalPeople);
        System.out.printf("%.2f%%%n", p3 * 100.0 / totalPeople);
        System.out.printf("%.2f%%%n", p4 * 100.0 / totalPeople);
        System.out.printf("%.2f%%%n", p5 * 100.0/ totalPeople);
    }
}
