public class CalculatorA extends Calculator {
    public void sum(){
        System.out.println("+ sum:" + (this.left + this.right));
    }
    public void avg(){
        System.out.println("+ avg: " + (this.left+this.right)/2);
    }
}
