import java.util.Scanner;
public class Gotmilk {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("Enter number of donuts:");
        int donutcnt = key.nextInt();

        System.out.println("Enter number of glasses of milk:");
        int milkcnt = key.nextInt();

        try{
            if(milkcnt<1){
                throw new Exception("Exception: No milk");
            }
        
            double donutsPerGlass = donutcnt/(double)milkcnt;
            System.out.println(donutcnt + " donuts");
            System.out.println(milkcnt + "glasses of milk");
            System.out.println("You have " + donutsPerGlass + " donuts for each glass of milk");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Go buy some milk");
        }
    
}