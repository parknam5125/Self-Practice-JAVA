import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner key= new Scanner(System.in);
        Student st1= new Student();
        char answer;
        st1.input();
        st1.compute();
        st1.output();
        answer=key.next().charAt(0);
        while(answer=='y'||answer=='Y'){
            st1.input();
            st1.compute();
            st1.output();
            answer=key.next().charAt(0);
        }
        key.close();
    }
}