class IntHolder{
    public int value = 0;
}
public class Final_1_IntHolder {
    public static void main(String[] args) {
        IntHolder n1 = new IntHolder();
        IntHolder n2 = new IntHolder();

        n1.value = 10;
        n2.value = 20;

        System.out.println("Before Swap: " + n1.value + ", " + n2.value );
        Swap(n1,n2);
        System.out.println("After Swap: " + n1.value + ", " + n2.value );
    }
    
    public static void Swap(IntHolder a, IntHolder b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}


