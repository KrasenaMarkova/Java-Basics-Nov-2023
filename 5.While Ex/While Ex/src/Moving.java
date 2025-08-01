import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int freeSpace = w * l * h;

        String numOfBoxes = scanner.nextLine();

        while (!"Done".equals(numOfBoxes)) {
            int input = Integer.parseInt(numOfBoxes);
            freeSpace -= input;
            if (freeSpace <= 0) {
                int meter = Math.abs(freeSpace);
                System.out.printf("No more free space! You need %d Cubic meters more.", meter);
                break;
            }
                numOfBoxes = scanner.nextLine();
        }
        if ("Done".equals(numOfBoxes)) {
            System.out.printf("%d Cubic meters left.", freeSpace);
        }
    }
}
