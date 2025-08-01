import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        // Мобилен оператор предлага договори с различна месечна такса в зависимост от срока -
        // 1 или 2 години. Да се напише програма, която изчислява дължимата сума,
        // която трябва да се плати за определен брой месеци.
        //Условия:
        // при добавен мобилен интернет, към таксата за един месец се добавя:
        //o при такса по-малка или равна на 10.00 лв.  5.50 лв.
        //o при такса по-малка или равна на 30.00 лв.  4.35 лв.
        //o при такса по-голяма от 30.00 лв.  3.85 лв.
        // ако договорът e за две години, общата сума се намалява с 3.75%

        Scanner scanner = new Scanner(System.in);

        String durationOfContract = scanner.nextLine();
        String typeContract = scanner.nextLine();
        String mobileInet = scanner.nextLine();
        int month = Integer.parseInt(scanner.nextLine());
        double fee = 0.0;
        double feeInet = 0.0;

        if (durationOfContract.equals("one")) {
            switch (typeContract) {
                case "Small":
                    fee = 9.98;
                    break;
                case "Middle":
                    fee = 18.99;
                    break;
                case "Large":
                    fee = 25.98;
                    break;
                case "ExtraLarge":
                    fee = 35.99;
                    break;
            }
        } else {
            switch (typeContract) {
                case "Small":
                    fee = 8.58;
                    break;
                case "Middle":
                    fee = 17.09;
                    break;
                case "Large":
                    fee = 23.59;
                    break;
                case "ExtraLarge":
                    fee = 31.79;
                    break;
            }
        }
        if (mobileInet.equals("yes")) {
            if (fee <= 10) {
                feeInet = 5.50;
            } else if (fee <= 30) {
                feeInet = 4.35;
            }else {
                feeInet = 3.85;
            }
        }
        double allTax = (fee + feeInet) * month;

        if (durationOfContract.equals("two")) {
            allTax = allTax - ((allTax * 3.75) / 100);
        }

        System.out.printf("%.2f lv.\n",allTax);
    }
}
