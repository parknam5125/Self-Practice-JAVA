import java.util.Scanner;
import java.io.*;
public class Final_22_Serializable {
    public static class Student implements Serializable {
        private String name;
        private int age;
        public Student(String str, int num){
            name = str;
            age = num;
        }
        
    }
    public static void main(String[] args) {
        String file = System.getProperty("user.home") + "\\Desktop\\numbers.dat";
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(new Student("park", 27));
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        Student s = (Student)in.readObject();
        in.close();
    }
}
