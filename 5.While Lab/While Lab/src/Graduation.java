import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        double sumAllGrades = 0.0;
        int countClasse = 0;
        int countLowGrade = 0;

        while (countClasse != 12) {
            double currentGrade = Double.parseDouble(scanner.nextLine());
            if (currentGrade < 4) {
                countLowGrade ++;
                if (countLowGrade > 1) {
                    break;
                }
            }
            sumAllGrades +=currentGrade;
            countClasse ++;
        }
        if (countClasse == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, sumAllGrades / 12);
        } else {
            System.out.printf("%s has been excluded at %d grade", name,countClasse);
        }
    }
}
