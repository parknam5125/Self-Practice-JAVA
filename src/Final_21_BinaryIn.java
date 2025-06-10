import java.io.*;
import java.util.Scanner;
public class Final_21_BinaryIn {
    public static void main(String[] args) throws FileNotFoundException, EOFException, IOException{
        String file = System.getProperty("user.home") + "\\Desktop\\numbers.dat";
        ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
        System.out.println("Reading the nonnegative integers");
        System.out.println("in the file " + file);
        int num = input.readInt();
        while(num>=0){
            System.out.println(num);
            num = input.readInt();
        }
        System.out.println("End of reading from file.");
        input.close();
    }
}
