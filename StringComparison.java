import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        System.out.println("Using == operator: " + (str1 == str2));
        System.out.println("Using equals() method: " + str1.equals(str2));
        
        scanner.close();
    }
}
