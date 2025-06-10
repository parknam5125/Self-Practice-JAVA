import java.io.*;
import java.util.Scanner;
public class Final_19_CSV {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String desktopPath = System.getProperty("user.home") + "\\Desktop\\trasaction.txt";
        Scanner input = new Scanner(new File(desktopPath));
        String line = input.nextLine();
        double total = 0;
        while (input.hasNextLine()) {
            line = input.nextLine();
            String[] arr = line.split(",");
            String SKU = arr[0];
            int quantity = Integer.parseInt(arr[1]);
            double price = Double.parseDouble(arr[2]);
            String description = arr[3];
            System.out.printf("Sold %d of %s (SKU: %s) at $%1.2f each. \n", quantity, description, SKU, price);
            total += quantity*price;
        }
        System.out.printf("Total sales: $%1.2f\n", total);
        input.close();
        
    }
}
