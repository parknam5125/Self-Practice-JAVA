import java.util.Scanner;
public class Final_5_Array {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("How many temperatures do you have?");
        int cnt = kb.nextInt();
        double[] temp = new double[cnt];
        System.out.println("Enter " + cnt + " temperatures:");
        double sum=0;
        for(int i = 0; i < temp.length; i++){
            temp[i] = kb.nextDouble();
            sum += temp[i];
        }
        double avg = sum / temp.length;
        System.out.println("The average temperatrue is " + avg);
        System.out.println("The temperatrues are");
        for(int i = 0; i < temp.length; i++){
            if(temp[i] > avg){
                System.out.println(temp[i] + " above average");
            }
            if(temp[i] < avg){
                System.out.println(temp[i] + " below average");
            }
            else{
                System.out.println(temp[i] + " same average");
            }
        }
        kb.close();

    }
}
