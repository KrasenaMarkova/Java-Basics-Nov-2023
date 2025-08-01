import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numTournirs = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int winner = 0;
        int pointsTurn = 0;


        for (int num = 0; num < numTournirs; num ++) {
            String turnirs = scanner.nextLine();

            switch (turnirs) {
                case "W":
                    pointsTurn += 2000;
                    winner ++;
                    break;
                case "F":
                    pointsTurn += 1200;
                    break;
                case "SF":
                    pointsTurn += 720;
                    break;
            }

        }
        System.out.printf("Final points: %d%n", startPoints + pointsTurn);
        System.out.printf("Average points: %.0f%n", Math.floor((double) pointsTurn / numTournirs)  );
        System.out.printf("%.2f%%%n", ((double) winner / numTournirs) * 100);
    }
}
