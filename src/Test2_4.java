public class Test2_4 {
    static int x = 0;   //moved
    public static void main(String[] args) {
        System.out.println(fun());
    }
    static int fun(){
        //static int x = 0;
        return ++x;
    }
    //OUTPUT: 1
}
