import java.io.*;
import java.util.Scanner;

public class Final_20_BinaryOut {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        String file = System.getProperty("user.home") + "\\Desktop\\numbers.dat";
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nonnegative integers.");
        System.out.println("Place a negative number at the end.");
        int num;
        do{
            num = sc.nextInt();
            output.writeInt(num);
        }while(num>=0);
        System.out.println("Written to the file " + file);
        /*String str;
        do{
            str = sc.nextLine();
            output.writeUTF(str);
        }while(!str.equals("end"));
        System.out.println("Written to the file " + file);*/
        output.close();
    }
}
