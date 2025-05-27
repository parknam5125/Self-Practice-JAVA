class Cal {
    int n1,n2;
    public void setOpeands(int n1, int n2){
        this.n1=n1;
        this.n2=n2;
    }
    public void divide(){
        try{
            System.out.println("Result");
            System.out.println(n1/n2);
        }
        catch(Exception e){
            System.out.println("Error1: " + e.getMessage());
            System.out.println("Error2: " + e.toString());
            System.out.println("Error3: ");
            e.printStackTrace();
        }
    }
}
public class CalDemo{
    public static void main(String[] args) {
        Cal c1 = new Cal();
        c1.setOpeands(10, 0);
        c1.divide();
    }
}