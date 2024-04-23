import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        double area = PI * radius * radius;
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
        
        scanner.close();
    }
}
