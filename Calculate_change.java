import java.util.Scanner;
public class Calculate_change {
    public static void main(String[] args) {
        int paid, price, change;
        int dollar,quarter,dime,nickel,cent;
        Scanner key=new Scanner(System.in);

        System.out.println("Enter paid(cent)");
        paid=key.nextInt();
        System.out.println("Enter price(cent)");
        price=key.nextInt();

        dollar=(int)(paid-price)/100;
        change=(paid-price)-100*dollar;

        quarter=(int)change/25;
        change=change-25*quarter;

        dime=(int)change/10;
        change=change-10*dime;

        nickel=(int)change/5;
        change=change-5*nickel;

        cent=change;

        System.out.println(dollar+" dollar \n"+quarter+" quarter \n" +dime+" dime \n"+nickel+" nickel \n"+cent+" cent\n");
        
        key.close();

    }
    
}
