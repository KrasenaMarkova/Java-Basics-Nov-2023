import java.util.Scanner;

public class VacationBookLIst {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int str = Integer.parseInt(scanner.nextLine());
        int str1hour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int book = str / str1hour;
        int hourperday = book / days;

        System.out.println(hourperday);
    }
}
