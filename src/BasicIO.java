import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class BasicIO {
    public static void main(String[] args) throws IOException {
        /*System.out.println("Read data1");
        int num = System.in.read();
        System.in.skip(2);
        System.out.println((char)num);

        byte data[] = new byte[100];
        System.out.println("Read data2");
        System.in.read(data);
        for(int i = 0 ; i < data.length ; i++){
            System.out.print((char)data[i]);
        }*/

        /*InputStreamReader is = new InputStreamReader(System.in);
        OutputStreamWriter os = new OutputStreamWriter(System.out);

        int readint = is.read();
        os.write((char)readint);

        is.close();
        os.close();*/

        /*InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        OutputStreamWriter os = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(os);
        String line = br.readLine();
        bw.write(line);
        bw.flush();
        bw.close();*/


        String st1 = "TEST 1";
        String st2 = "TEST 2";
        String st3 = "TEST";
        String st4 = " 1";
        System.out.println("st1: " + st1.hashCode());
        System.out.println("st2: " + st2.hashCode());
        System.out.println("st3: " + st3.hashCode());
        System.out.println("st4: " + st4.hashCode());

        st1 = st1 + st2;
        System.out.println("st1: " + st1.hashCode());
        st3 = st3 + st4;
        System.out.println("st3: " + st3.hashCode());

        StringBuffer sb = new StringBuffer();
        System.out.println("sb: " + sb.hashCode());
        sb.append("TEST StringBuffer");
        System.out.println("sb: " + sb.hashCode());

        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");
        System.out.println(a==b);
        System.out.println(c==b);
    }
    
}
