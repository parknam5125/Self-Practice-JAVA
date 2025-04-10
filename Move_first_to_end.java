import java.util.Scanner;
public class Move_first_to_end {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        String in, temp1, temp2, out;
        int index;

        System.out.println("Enter text line");
        in=key.nextLine();
        index=in.indexOf(" ");
        temp1=in.substring(0,index);
        temp2=in.substring(index+1);
        System.out.println(in);
        System.out.println(temp1);
        System.out.println(temp2);
        temp2=temp2.concat(" ");
        temp2=temp2.concat(temp1);
        temp2 = temp2.substring(0, 1).toUpperCase() + temp2.substring(1);
        System.out.println(temp2);
        
        key.close();
    }
}
