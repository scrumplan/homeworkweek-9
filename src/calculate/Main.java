package calculate;
import java.util.Scanner;
public class Main extends Calculator  {
    public static void main(String[] args) {
        char s1;
        do {
            System.out.println("Enter first Number: ");
            Scanner scanner = new Scanner(System.in);
            int s = scanner.nextInt();
            System.out.println("Enter second Number: ");
            int p = scanner.nextInt();
            System.out.println("Please enter one of symbol +,-,*, /: ");
            char symbol = scanner.next().charAt(0);
            Calculator calc = new Calculator();
            calculateResult(s, p, symbol);
            System.out.println("Would you to do more caluclatore please Y or N:" );
             s1 = scanner.next().charAt(0);
            // ch = s1.charAt(0);
        } while(s1 == 'Y' || s1 == 'y');
       // scanner.close();



    }
}
