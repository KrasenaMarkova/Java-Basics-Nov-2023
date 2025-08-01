import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double income = Double.parseDouble(scanner.nextLine());

        double result = 0.0;

        boolean validDate = true;

        if (town.equals("Sofia")) {
            if (income >= 0 && income <= 500) {
                result = income * 0.05;
            } else if (income > 500 && income <= 1000) {
                result = income * 0.07;
            } else if (income > 1000 && income <= 10000) {
                result = income * 0.08;
            } else if (income > 10000) {
                result = income * 0.12;
            } else {
                validDate = false;
            }
        } else if (town.equals("Varna")) {
            if (income >= 0 && income <= 500) {
                result = income * 0.045;
            } else if (income > 500 && income <= 1000) {
                result = income * 0.075;
            } else if (income > 1000 && income <= 10000) {
                result = income * 0.10;
            } else if (income > 10000) {
                result = income * 0.13;
            } else {
                validDate = false;;
            }
        } else if (town.equals("Plovdiv")) {
            if (income >= 0 && income <= 500) {
                result = income * 0.055;
            } else if (income > 500 && income <= 1000) {
                result = income * 0.08;
            } else if (income > 1000 && income <= 10000) {
                result = income * 0.12;
            } else if (income > 10000) {
                result = income * 0.145;
            } else {
                validDate = false;;
            }
        } else {
            validDate = false;
        }
        if (!validDate) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f",result);
        }
    }
}
