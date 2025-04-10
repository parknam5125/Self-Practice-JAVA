import java.util.Scanner;
public class Char_to_grade {

    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        char in;
        float value;

        System.out.println("Enter your grade");
        in=key.next().charAt(0);
        if (in == 'a' || in == 'A') {
            value = 4.0f;
        } else if (in == 'b' || in == 'B') {
            value = 3.0f;
        } else if (in == 'c' || in == 'C') {
            value = 2.0f;
        } else if (in == 'd' || in == 'D') {
            value = 1.0f;
        } else if (in == 'f' || in == 'F') {
            value = 0.0f;
        } else {
            System.out.println("Invalid grade entered.");
            return;
        }
        System.out.println("Your gradevalue is "+ value);
    }
}
