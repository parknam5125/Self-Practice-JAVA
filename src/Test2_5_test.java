public class Test2_5_test {
    Test2_5 t1 = new Test2_5(10);
    Test2_5_test(int i) { t1 = new Test2_5(i); }
    public static void main(String[] args) {
        Test2_5_test t2 = new Test2_5_test(5);
    }
    //OUTPUT: Constructor called 10
    //OUTPUT: Constructor called 5
}
