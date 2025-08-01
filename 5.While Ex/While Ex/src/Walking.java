import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int targetSteps = 10000;
        String command = "Going home";

        while (0 < targetSteps) {
            String input = scanner.nextLine();
           if (input.equals("Going home")) {
               int currentSteps = Integer.parseInt(scanner.nextLine());
               targetSteps -= currentSteps;
               break;
           }
           int currentSteps = Integer.parseInt(input);
            targetSteps -= currentSteps;

        }
        if (0 >= targetSteps) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!",Math.abs(targetSteps));
        } else {
            System.out.printf("%d more steps to reach goal.", targetSteps);
        }
    }
}
