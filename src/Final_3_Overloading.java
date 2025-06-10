public class Final_3_Overloading {
    public static void main(String[] args) {
        double avg1 = getAvg(40.0, 50.0);
        double avg2 = getAvg(1.0, 2.0, 3.0);
        char avg3 = getAvg('a', 'c');
        System.out.println("avg1= " + avg1);
        System.out.println("avg2= " + avg2);
        System.out.println("avg3= " + avg3);
    }
    public static double getAvg(double n1, double n2){
        return (n1+n2)/2.0;
    }
    public static double getAvg(double n1, double n2, double n3){
        return (n1+n2+n3)/3.0;
    }
    public static char getAvg(char c1, char c2){
        return (char)(((int)c1 + (int)c2)/2);
    }
}
