import java.util.Scanner;
public class Cash_charge {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        float cash;
        float charge;
        System.out.println("Enter chashing money.");
        cash=key.nextFloat();

        if(cash<10){
            charge=1;
        }
        else if(cash<100){
            charge=cash/10;
        }
        else if(cash<1000){
            charge=cash/20+5;
        }
        else{
            charge=cash/100+40;
        }
        if(charge<0.25||charge%5==0||charge>1){
            System.out.println("Error");
        }
        else{
            System.out.println("Your cashing charge is "+charge+" $");
        }
        key.close();
    }
    
}
