import java.util.Scanner;

public class MultiplyTable {

    public static void main(String[] args) {
        // Най-малкият син на семейство Иванови все още не знае таблицата за умножение.
        // Веднага след коледните празници, той ще има контролно и вие трябва да му помогнете да я научи.
        // Вашата задача е да съставите програма, в която се въвежда цяло трицифрено число
        // и се извежда таблицата за умножение. Поради особености на Вашата програма,
        // тя взима цифрите на въведеното число в обратен ред.
        // Максималната стойност на множителите е определена от всяка една от 3-те цифри на въведеното число.

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

       int d3 = num % 10;
       int d2 = (num / 10) % 10;
       int d1 = ((num / 10) / 10);


        for (int i = 1; i <= d3 ; i++) {

            for (int j = 1; j <= d2 ; j++) {

                for (int k = 1; k <= d1 ; k++) {
                    int result = i * j * k;
                    System.out.printf("%d * %d * %d = %d;\n", i, j, k, result);
                }
            }
        }
    }
}
