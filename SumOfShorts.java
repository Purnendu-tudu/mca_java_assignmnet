import java.util.Scanner;

public class SumOfShorts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first short integer: ");
        short num1 = scanner.nextShort();
        
        System.out.print("Enter second short integer: ");
        short num2 = scanner.nextShort();
        
        short sum = (short) (num1 + num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        
        scanner.close();
    }
}
