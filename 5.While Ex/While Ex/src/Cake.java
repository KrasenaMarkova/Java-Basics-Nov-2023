import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int cake = l * h;
        String piecesCake = scanner.nextLine();

        while (!piecesCake.equals("STOP")) {
            int input = Integer.parseInt(piecesCake);
            cake -= input;
            if (cake < 0) {
                int needPieceOfCake = Math.abs(cake);
                System.out.printf("No more cake left! You need %d pieces more.", needPieceOfCake);
                break;
            }
            piecesCake = scanner.nextLine();
        }
        if (piecesCake.equals("STOP")) {
            System.out.printf("%d pieces are left.", cake);
        }
    }
}
