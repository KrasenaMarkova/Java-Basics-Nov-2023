import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfJudge = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();
        double totalGrades = 0.0;
        int countPresentation = 0;


        while (!presentation.equals("Finish")) {
            countPresentation ++;
            double grades = 0.0;

            for (int n = 1; n <= numOfJudge; n++) {
                double grade = Double.parseDouble(scanner.nextLine());
                grades += grade;
            }
            System.out.printf("%s - %.2f.\n", presentation, grades / numOfJudge);

            totalGrades += grades;
            presentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", totalGrades / (numOfJudge * countPresentation));
    }
}
