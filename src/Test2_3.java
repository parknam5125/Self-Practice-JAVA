public class Test2_3 {
    private int x=2;
    Test2_3(int i) { x = ++i; } //constructor
    public static void main(String[] args) {
        Test2_3 tmp = new Test2_3(5);
        System.out.println("x = "+ tmp.x);
    }
    //OUTPUT: 6
}
