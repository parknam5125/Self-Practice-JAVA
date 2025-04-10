import java.util.Scanner;
public class Calculate_circle {
    static final float PI = 3.14159f;
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        float radius;

        System.out.println("Enter the radius of a circle in inches:");
        radius = key.nextFloat();
        System.out.println("A circle of radius " + radius + " inches");
        System.out.println("has an arear of " + PI*radius*radius + " square inches.");
        key.close();
    }
}
