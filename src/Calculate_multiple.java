import java.util.Scanner;
public class Calculate_multiple {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int egg, basket;
        System.out.println("Enter your eggs and basket");
        egg = key.nextInt();
        basket = key.nextInt();
        System.out.println("If you have");
        System.out.println(egg + " eggs per basket and");
        System.out.println(basket + "baskets, then");
        System.out.println("the total number of eggs is " + egg*basket);
        key.close();
    }
}
