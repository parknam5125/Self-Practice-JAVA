import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        System.out.println(12345 + 5432.1);
        System.out.println(12345 + (int)5432.1);
        
        //OUTPUT: 17777.1
        //OUTPUT: 17777

        System.out.println("H" + "A");
        System.out.println('H' - 'A');

        //OUTPUT: HA
        //OUTPUT: 7
        
        String pig = "length: 10";
        String dog = "length: " + pig.length();
        System.out.println(dog);
        System.out.println("Animals are equal: " + pig == dog);
        
        //OUTPUT: length: 10
        //OUTPUT: false

        int minutes = 0;
        for(int ms = 0 ; ms < 60*60*1000; ms++)
            if((ms%60)*1000==0) minutes++;
        System.out.println(minutes);

        //OUTPUT: 60000
        
        int END=Integer.MAX_VALUE;
        int START = END - 10;
        int count = 0;
        for(int i = START; i < END; i++)
            count++;
        System.out.println(count);

        //OUTPUT: 10
    }
}