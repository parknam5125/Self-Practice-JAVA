import java.io.*;
import java.util.Scanner;
public class Final_18_TextFileIn {
    public static void main(String[] args) throws FileNotFoundException{
        String desktopPath = System.getProperty("user.home") + "\\Desktop\\out2.txt";
        Scanner input = new Scanner(new File(desktopPath));
        while(input.hasNextLine()){
            String line = input.nextLine();
            System.out.println(line);
        }
        input.close();
    }
}
