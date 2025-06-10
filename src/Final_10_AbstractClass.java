public class Final_10_AbstractClass {
    public static void main(String[] args) {
        CalculatorA c1 = new CalculatorA();
        c1.setOperands(10, 20);
        c1.run();

        CalculatorB c2 = new CalculatorB();
        c2.setOperands(10, 20);
        c2.run();
    }
    static class CalculatorA extends Calculator {
        public void sum(){
            System.out.println("sum: " + (this.L + this.R));
        }
        public void avg(){
            System.out.println("avg: " + (this.L + this.R)/2);
        }
    }
    static class CalculatorB extends Calculator {
        public void sum(){
            System.out.println("sum: " + (this.L + this.R));
        }
        public void avg(){
            System.out.println("avg: " + (this.L + this.R)/2);
        }
    }
    abstract static class Calculator {
        int L,R;
        public void setOperands(int L, int R){
            this.L = L;
            this.R = R;
        }
        public abstract void sum();
        public abstract void avg();
        public void run(){
            sum();
            avg();
        }
    }
}
