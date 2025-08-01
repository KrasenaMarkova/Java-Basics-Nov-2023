import java.util.Scanner;

public class GiftsFromSanta {
    public static void main(String[] args) {
        //Дядо Коледа започва да обикаля от град на град за да носи подаръци на всички послушни деца.
        // Той ви моли да напишете програма, която да принтира на конзолата всички адресни номера от М до N,
        // които се делят едновременно на 2 и на 3 без остатък,
        // тъй като Дядо Коледа, знае че там живеят само послушни деца.
        // От конзолата ще се чете още един номер на адрес S. Ако някой от адресните номера от M до N,
        // които се делят на 2 и 3, е равен на адреса S, този адрес не трябва да се принтира и
        // програмата трябва да приключи. В противен случай се принтират всички адресни номера до N,
        // които отговарят на условието.

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());

        for (int i = m; i >= n; i--) {
                if (i % 2 == 0 && i % 3 == 0) {
                    if (i == s) {
                        break;
                    }
                    System.out.print(i + " ");
                }

        }
    }
}
