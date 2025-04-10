import java.util.Scanner;
public class Student {
    int quiz1,quiz2;
    int midterm;
    int finalscore;
    float totalscore;
    char grade;
    String name;
    void input(){
        Scanner key = new Scanner(System.in);
        System.out.println("What is the student's name?");
        name = key.nextLine();
        
        do{
            System.out.println("Quiz 1 score must be between 0 and 10 -");
            System.out.println("Please enter a valid Quiz 1 score:");
            quiz1 = key.nextInt();
        }while(quiz1>10 || quiz1<0);
        do{
            System.out.println("Quiz 2 score must be between 0 and 10 -");
            System.out.println("Please enter a valid Quiz 2 score:");
            quiz2 = key.nextInt();
        }while(quiz2>10 || quiz2<0);
        do{
            System.out.println("Midterm score must be between 0 and 100 -");
            System.out.println("Please enter a valid midterm score:");
            midterm = key.nextInt();
        }while(midterm>100 || midterm<0);
        do{
            System.out.println("Final exam score must be between 0 and 100 -");
            System.out.println("Please enter a valid final exam score:");
            finalscore = key.nextInt();
        }while(finalscore>100 || finalscore<0);
    }
    void output(){
        System.out.println("Name = " + name);
        System.out.println("Quiz 1 score (out of 10pts) = " + quiz1);
        System.out.println("Quiz 2 score (out of 10pts) = " + quiz2);
        System.out.println("Midterm score (out of 100pts) = " + midterm);
        System.out.println("Final exam score (out of 100pts) = " + finalscore);
        System.out.println(name+"\'s percentage grade is " + (int)totalscore);
        System.out.println(name+"\'s letter grade is " + grade);
        System.out.println("Do again? (Y for Yes, or N for No)");
    }
    void compute(){
        totalscore = (float)(10*quiz1/8 + 10*quiz2/8 + midterm/4 + finalscore/2);
        if (totalscore >= 90) {
            grade = 'A';
        } else if (totalscore >= 80) {
            grade = 'B';
        } else if (totalscore >= 70) {
            grade = 'C';
        } else if (totalscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }
}
