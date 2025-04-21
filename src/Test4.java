import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int[] frequency = new int[10];//new int[10]
        for(int i=0;i<frequency.length;i++){//length
            frequency[i]=0;
        }
        Scanner kb = new Scanner(System.in);//System.in
        System.out.print("Enter the number of students: ");
        String p = kb.nextLine();//nextLine()

        for(int i = 0; i<p.length(); i++){//length()
            char ch = p.charAt(i);//charAt
            if(!Character.isDigit(ch)){//isDigit
               continue; 
            }
            int index = Character.getNumericValue(ch);//getNumericValue
                frequency[index]++;
        }
        for(int i =0;i<frequency.length;i++){//length
            System.out.println("frequency[" + i + "] = "+frequency[i]);
        }
        kb.close();
    }
}
