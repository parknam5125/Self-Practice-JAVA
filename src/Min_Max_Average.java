import java.util.Scanner;
public class Min_Max_Average {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int min=0,max=0,input=0,cnt=0,sum=0;
        double average;
        while(input>=0){
            System.out.println("Enter integers.");
            input=key.nextInt();
            if(input<0){
                break;
            }
            if(cnt==0){
                min=max=input;
            }
            if(input>max){
                max=input;
            }
            if(input<min){
                min=input;
            }
            sum+=input;
            cnt++;
        }
        average=(double)sum/cnt;
        System.out.println("Min : "+ min);
        System.out.println("Max : "+ max);
        System.out.println("Average : "+ average);
        key.close();
    }
}
