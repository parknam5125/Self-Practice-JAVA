public class Species_population {

    public static void main(String[] args) {
        Species sp1= new Species();
        Species sp2= new Species();

        sp1.read();
        sp1.write();
        int output=sp1.expect();
        System.out.println(output);
    }
}
