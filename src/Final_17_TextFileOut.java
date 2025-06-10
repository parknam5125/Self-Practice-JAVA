import java.io.*;
import java.util.Scanner;
public class Final_17_TextFileOut {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        String desktopPath = System.getProperty("user.home") + "\\Desktop\\out2.txt";
        PrintWriter output = new PrintWriter(desktopPath);
        //PrintWriter output = new PrintWriter(new FileOutputstream(desktopPath, true));
        //Append
        System.out.println("Enter three lines of text:");
        for(int i = 0; i < 3; i++){
            String line = sc.nextLine();
            output.println(line);
        }
        output.close();
        sc.close();
    }
}
