import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pointsForNomination = 1250.5;

        String actorName = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i ++) {
            String judgeName = scanner.nextLine();
            double pointJudge = Double.parseDouble(scanner.nextLine());
            pointJudge= (judgeName.length() * pointJudge) / 2;
            points += pointJudge;

            if (points >= pointsForNomination){
                break;
            }
        }
        if (points >= pointsForNomination) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, points);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, pointsForNomination - points);
        }
    }
}
