import java.util.Scanner;

public class Workout {

    public static void main(String[] args) {
        // Г-жа Иванова иска да отслабне след празниците. Започвайки тренировка,
        // първия ден тя пробягва М километра. Следващите N дни, тя увеличава дневната си норма с К%.
        // За да успее да отслабне, тя трябва да избяга минимум 1 000 км.
        // Съставете програма, която при получени начални километри, брой дни и проценти,
        // с които тя ще увеличава всеки ден нормата си, ще проверява дали километрите,
        // които тя е избягала са достатъчни. Ако километрите не са достатъчни,
        // на конзолата да се изведат недостигащите километри.
        // Ако са достатъчни да се изведе съобщение в което г-жа Иванова е поздравена за добре свършената работа.

        Scanner scanner = new Scanner(System.in);

        int trainingDays = Integer.parseInt(scanner.nextLine());
        double kmFirstDay = Double.parseDouble(scanner.nextLine());

        int targetSteps = 1000;
        double kmForEveryDay = 0.00;
        double allKm = kmFirstDay;


        for (int inputDays = 0; inputDays < trainingDays; inputDays++) {
            int percentForEveryDay = Integer.parseInt(scanner.nextLine());


            if (inputDays == 0) {
                kmForEveryDay = kmFirstDay + ((kmFirstDay * percentForEveryDay) / 100);
            } else {
                kmForEveryDay += (kmForEveryDay * percentForEveryDay) / 100;
            }
            allKm += kmForEveryDay;

        }
        double differenceKm = Math.abs(allKm - 1000);

        if (allKm >= 1000) {
            System.out.printf("You've done a great job running %d more kilometers!\n", (Math.round(Math.ceil(differenceKm))));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %d more kilometers\n", (Math.round(Math.ceil(differenceKm))));
        }

    }
}
