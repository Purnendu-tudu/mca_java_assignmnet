import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter height in cm: ");
        int heightInCm = scanner.nextInt();
        
        int feet = heightInCm / 30;
        int inches = (int) ((heightInCm % 30) / 2.54);
        
        System.out.println("Height is " + feet + " feet " + inches + " inches");
        
        scanner.close();
    }
}
