import java.util.Scanner;
public class Scanner_Demo {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int num1,num2;
        double n1,n2;
        String s1,s2,s3;

        System.out.println("Enter two whole numbers");
        System.out.println("separated by one or more spaces:");
        num1=key.nextInt();
        num2=key.nextInt();
        System.out.println("You entered " + num1 +" and "+num2);

        System.out.println("Next enter two numbers.");
        System.out.println("A decimal point is OK.");
        n1=key.nextDouble();
        n2=key.nextDouble();
        System.out.println("You entered " + n1 +" and "+n2);

        System.out.println("Next enter two word:");
        s1=key.next();
        s2=key.next();
        System.out.println("You entered " + "\"" + s1 + "\"" + " and " + "\"" + s2 + "\"");
        
        s1=key.nextLine();

        System.out.println("Next enter a line of text:");
        s3=key.nextLine();
        System.out.println("You entered "+"\""+s3+"\"");

        key.close();
    }
}
