import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tab = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        boolean isLostSalary = true;

        for ( int i = 1; i <= tab; i ++) {
            String web = scanner.nextLine();
            switch (web) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0) {
                break;
            }

        }
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println((int) salary);
        }
    }
}
