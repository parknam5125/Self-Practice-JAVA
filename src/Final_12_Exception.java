public class Final_12_Exception {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            if (b == 0) {
                throw new MyException("안돼");//안적으면 에러러
            }
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (MyException e) {
            System.out.println("Exception: Devide by 0");
            System.out.println(e.getMessage());
        }

        System.out.println("exit");
    }
    public static class MyException extends Exception{
        public MyException(){
            super("에러");
        }
        public MyException(String msg){
            super(msg);
        }
    }
}
