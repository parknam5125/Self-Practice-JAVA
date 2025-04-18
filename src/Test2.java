import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int[] frequency = new int[10];
        for(int i=0;i<frequency.length;i++){
            frequency[i]=0;
        }
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        String p = kb.nextLine();

        for(int i = 0; i<p.length(); i++){
            char ch = p.charAt(i);
            if(!Character.isDigit(ch)){
               continue; 
            }
            int index = Character.getNumericValue(ch);
                frequency[index]++;
        }
        for(int i =0;i<frequency.length;i++){
            System.out.println("frequency[" + i + "] = "+frequency[i]);
        }
        kb.close();
    }
}
