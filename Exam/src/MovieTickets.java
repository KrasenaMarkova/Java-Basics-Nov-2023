import java.util.Scanner;

public class MovieTickets {

    public static void main(String[] args) {
        // Трябва да напишете програма, която чете три цели числа a1, a2,
        // n въведени от потребителя и генерира номера за билети, които се състоят от следните 4 символа:
        //Символ 1: символ с ASCII код от а1 до а2 - 1
        //Символ 2: цифра от 1 до n - 1
        //Символ 3: цифра от 1 до n / 2 - 1
        //Символ 4: цифрова репрезентация (ASCII код) на символ 1
        //След като са изпълнени условията се генерира следния билет:
        //"{Символ 1}-{Символ 2}{Символ 3}{Символ 4}"

        Scanner scanner = new Scanner(System.in);

        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int symbol1 = a1; symbol1 <= a2 - 1; symbol1++) {

            for (int symbol2 = 1; symbol2 <= n - 1; symbol2++) {

                for (int symbol3 = 1; symbol3 <= n / 2 - 1; symbol3++) {

                    if (symbol1 % 2 != 0 && (symbol3 +symbol2 +symbol1) % 2 != 0) {

                        System.out.printf("%c-%d%d%d\n", symbol1, symbol2, symbol3, symbol1);
                    }
                }
            }
            
        }

    }
}
