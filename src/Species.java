import java.util.Scanner;
public class Species {
    String name;
    int pop;
    float grow;
    int year;

    void read(){
        Scanner key = new Scanner(System.in);
        System.out.println("Enter name");
        name=key.nextLine();
        System.out.println("Enter population");
        pop=key.nextInt();
        System.out.println("Enter growth rate");
        grow=key.nextFloat();
        System.out.println("Enter year");
        year=key.nextInt();
    }
    void write(){
        System.out.println("Name : "+name);
        System.out.println("Population : "+pop);
        System.out.println("Growth rate : "+grow);
    }
    int expect(){
        int result=pop;
        for(int i = 0 ; i < year ; i++){
            result=(int)(result*(1+(grow/100)));
        }
        return result;
    }
    
}
