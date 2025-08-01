import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        // Дадени са n цели числа в интервала [1…1000].
        // От тях някакъв процент p1 се делят без остатък на 2, друг процент p2 се делят без остатък на 3,
        // друг процент p3 се делят без остатък на 4. Да се напише програма,
        // която изчислява и отпечатва процентите p1, p2 и p3.
        //Пример: имаме n = 10 числа: 680, 2, 600, 200, 800, 799, 199, 46, 128, 65.
        // Получаваме следното разпределение и визуализация:

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num % 2 == 0) {
                p1++;
            }
            if (num % 3 == 0) {
                p2++;
            }
            if (num % 4 == 0) {
                p3++;
            }
        }

        System.out.printf("%.2f%%\n", ((double) p1 / n) * 100);
        System.out.printf("%.2f%%\n", ((double) p2 / n) * 100);
        System.out.printf("%.2f%%\n", ((double) p3 / n) * 100);

    }
}
