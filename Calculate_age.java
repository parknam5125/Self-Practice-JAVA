import java.util.Scanner;
public class Calculate_age {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int birth, age, now;

        System.out.println("Enter your birth year.");
        birth = key.nextInt();
        System.out.println("Enter now year.");
        now = key.nextInt();
        age = now - birth + 1;
        System.out.println("Your age is " + age);

        key.close();
    }
}
