import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        // Група ентусиасти обикалят по различни локации, където има златни мини.
        // Вашата задача е да им помогнете като напишете програма, която да приема броя на локациите
        // и очакван среден добив на злато за ден за една локация. За всеки ден ще получавате колко злато
        // са добили на локацията. Проверете дали са постигнали очаквания добив за дадена локация или не.
        //Вход:
        //Първоначално от конзолата се прочита едно число – брой локации – цяло число в интервала [1.. 100]
        //За всяка една локация се четат две числа, по едно на ред:
        //1. На първия ред – очакван среден добив на ден злато – реално число в интервала [0.00.. 10000.00]
        //2. На втория ред – брой дни, в който ще се копае на дадената локация – цяло число в интервала [1.. 30]
        //За всеки ден се чете по едно число:
        // Добито злато за деня – реално число в интервала [0.00.. 1000.00]

        Scanner scanner = new Scanner(System.in);

        int numOfLocations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numOfLocations; i++) {

            double sumOfYieldForAllDays = 0;
            double expectedAverageYieldPerDayOfGold = Double.parseDouble(scanner.nextLine());
            int numOfDays = Integer.parseInt(scanner.nextLine());

            for (int n = 1; n <= numOfDays; n++) {
                double yieldPerEveryDayOfGold = Double.parseDouble(scanner.nextLine());
                sumOfYieldForAllDays += yieldPerEveryDayOfGold;

            }
            double averageYieldForDays = sumOfYieldForAllDays / numOfDays;

            if (expectedAverageYieldPerDayOfGold > averageYieldForDays) {
                System.out.printf("You need %.2f gold.\n", expectedAverageYieldPerDayOfGold - averageYieldForDays);
            } else  {
                System.out.printf("Good job! Average gold per day: %.2f.\n", averageYieldForDays);
            }
        }

    }
}
