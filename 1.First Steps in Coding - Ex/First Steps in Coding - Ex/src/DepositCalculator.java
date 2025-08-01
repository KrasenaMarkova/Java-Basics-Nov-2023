import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double dep = Double.parseDouble(scanner.nextLine());
        int srok = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double lihva = dep * (percent/100);
        double lihva1mes = lihva / 12;
        double krainasuma = dep + (srok * lihva1mes);

        System.out.println(krainasuma);



    }
}
