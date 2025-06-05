import java.util.Scanner;
public class ShippingApplication {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int a, b;
        String ch = key.nextLine();
        ShippingManager m = new ShippingManager();
        do{
            System.out.println("Enter weight:");
            a = key.nextInt();
            System.out.println("Enter distance:");
            b = key.nextInt();
            m.setShipment(a, b);
            m.applyAllPolicies();
            m.sortPoliciesByCost();
            System.out.println("Do you want to enter another shipment? (y/n):");
            ch = key.nextLine();
        }while(!ch.equalsIgnoreCase("n"));
    }
}
