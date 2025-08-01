import java.util.Scanner;

public class AreaofFigures {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String figura = scanner.nextLine();
        double area = 0;

         if ( figura.equals("square")) {
             double a = Double.parseDouble(scanner.nextLine());
             area = a * a;
         } else if (figura.equals("rectangle")) {
             double a = Double.parseDouble(scanner.nextLine());
             double b = Double.parseDouble(scanner.nextLine());
             area = a * b;
         } else if (figura.equals("circle")) {
             double r = Double.parseDouble(scanner.nextLine());
             area = Math.PI * r * r;
         } else if (figura.equals("triangle")) {
             double a = Double.parseDouble(scanner.nextLine());
             double h = Double.parseDouble(scanner.nextLine());
             area = a * h / 2;
         }
         System.out.printf("%.3f", area);

    }
}
