import java.util.Scanner;
public class ArrayOfTemperatrues {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("How many temperatrues do you have?");
        int cnt = key.nextInt();
        double sum = 0,avg;
        double[] temp = new double[cnt];
        System.out.println("Enter " + cnt + " temperatrues:");
        for(int i = 0 ; i < cnt ; i++){
            temp[i] = key.nextDouble();
            sum += temp[i];
        }
        avg = sum/cnt;
        System.out.println("The average temperature is " + avg);
        for(int i = 0 ; i < cnt ; i++){
            if(temp[i] < avg){
                System.out.println(temp[i] + " below average");
            }
            else if(temp[i] > avg){
                System.out.println(temp[i] + " above average");
            }
            else{
                System.out.println(temp[i] + " same average");
            }
        }
        System.out.println("Have a nice week.");
    }
}
