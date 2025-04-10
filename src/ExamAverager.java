import java.util.Scanner;
public class ExamAverager {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        char reponse;
        int i, input;
        float avg=0;
        while(true){
            int sum=0;
            int cnt=0;
            System.out.println("Want to average another exam?");
            System.out.println("Enter Y or N.");
            reponse=key.next().charAt(0);
            if(reponse!='y'&&reponse!='Y'){
                break;
            }
            System.out.println("Enter all the scores to be averaged.");
            System.out.println("Enter a negative number after");
            System.out.println("you have entered all the scores.");
            while(true){
                input=key.nextInt();
                if(input<0){
                    break;
                }
                sum+=input;
                cnt++;
                avg=sum/cnt;
            }
            System.out.println("The average is "+avg);
        }
        key.close();
    }
}
