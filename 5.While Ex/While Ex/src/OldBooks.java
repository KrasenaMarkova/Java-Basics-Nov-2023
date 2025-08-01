import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();

        String input = scanner.nextLine();
        int countBooks = 0;

        while (!input.equals("No More Books")) {
            if (input.equals(book)) {
                break;
            }
            input = scanner.nextLine();
            ++ countBooks;
        }
        if (input.equals(book)) {
            System.out.printf("You checked %d books and found it.",countBooks);

        } else {
            System.out.printf("The book you search is not here!%n");
            System.out.printf("You checked %d books.", countBooks);
        }
    }
}
