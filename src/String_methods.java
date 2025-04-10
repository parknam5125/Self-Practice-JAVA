public class String_methods {

    public static void main(String[] args) {
        String test = "a bc def";
        String test2 = "ghij";
        String con;

        System.out.println("test : " + test);

        char k = test.charAt(0);
        System.out.println("char k = test.charAt(0);\nk = " + k);

        System.out.println(test.compareTo(test2));
        System.out.println("System.out.println(test.compareTo(test2));" + test.compareTo(test2));

        con=test.concat(test2);
        System.out.println("con=test.concat(test2);\n" + con);

        
    }
}
