import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxPoorGrades = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int grade = Integer.parseInt(scanner.nextLine());
        int poorGrade = 0;
        int countGrade = 0;
        double grades = 0.0;
        String lastInput = "";


        while (!"Enough".equals(input)) {
            lastInput = input;
            countGrade++;
            grades += grade;

            if (grade <= 4) {
                poorGrade++;
            }
            if (poorGrade == maxPoorGrades) {
                System.out.printf("You need a break, %d poor grades.", poorGrade);
                break;
            }
            input = scanner.nextLine();
            if (input.equals("Enough")){
                System.out.printf("Average score: %.2f%n", grades / countGrade);
                System.out.printf("Number of problems: %d%n", countGrade);
                System.out.printf("Last problem: %s", lastInput);
                break;
            }
            grade = Integer.parseInt(scanner.nextLine());
        }
    }
}
