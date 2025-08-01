import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        // Напишете програма, която ви помага при товаренето на куфари в багажника на самолет.
        // Всеки самолет има определен капацитет на багажника. До получаване на команда "End"
        // ще получавате обем на куфар. Обемът на всеки трети куфар трябва да се увеличава с 10%,
        // поради загубата на пространство при начина на подреждане. Ако свободното пространството
        // в даден момент е по-малко от обема на куфар товаренето трябва да прекъсне.

        Scanner scanner = new Scanner(System.in);

        double trunk = Double.parseDouble(scanner.nextLine());
        String suitcase = scanner.nextLine();

        while (!"End".equals(suitcase)) {
            
        }
    }
}
