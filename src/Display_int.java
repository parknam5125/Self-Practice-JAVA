import java.util.Scanner;
public class Display_int {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int num1, num2, temp;
        System.out.println("Enter two integers");
        num1 = key.nextInt();
        num2 = key.nextInt();

        if(num1>num2){
            temp=num1;
            num1=num2;
            num2=temp;
        }

        for(int i=num1 ; i<=num2 ; i++){
            System.out.println(i);
        }
        key.close();
    }
}
