import java.util.Scanner;
public class Count_Grade {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int a=0, b=0, c=0, d=0, f=0;
        int cnt=0;
        int input;

        while(true){
            System.out.println("Enter percentage");
            input=key.nextInt();

            if(input>100){
                System.out.println("Invalid");
                continue;
            }
            if(input<0){
                break;
            }
            if(input>=90){
                a++;
            }
            else if(input>=80){
                b++;
            }
            else if(input>=70){
                c++;
            }
            else if(input>=60){
                d++;
            }
            else{
                f++;
            }
            cnt++;
        }
        System.out.println("Total count: "+cnt);
        System.out.println("A count: "+a);
        System.out.println("B count: "+b);
        System.out.println("C count: "+c);
        System.out.println("D count: "+d);
        System.out.println("F count: "+f);
        key.close();
    }
}
