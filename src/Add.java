import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int num1, num2;

        System.out.println("Hello out there");
        System.out.println("I will add two numbers for you.");
        System.out.println("Enter two whole numbers on a line:");
        num1 = key.nextInt();
        num2 = key.nextInt();
        System.out.println("The sum of those two numbers is");
        System.out.println(num1 + num2);
        key.close();
    }
}
