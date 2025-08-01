import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;

        for (int rows = 1; rows <= n; rows++) {
            for (int colums = 1; colums <= rows; colums++) {
                if (num > n) {
                    break;
                }
                System.out.print(num + " ");
                num ++;
            }
            if (num > n) {
                break;
            }
            System.out.println();
        }
    }
}
