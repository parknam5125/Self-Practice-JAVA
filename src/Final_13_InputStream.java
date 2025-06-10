import java.io.IOException;
import java.io.InputStream;
public class Final_13_InputStream {
    public static void main(String[] args) throws IOException{
        System.out.println("Read data 1");
        int numint = System.in.read();
        System.in.skip(2);
        System.out.println((char)numint);

        byte data[] = new byte[100];
        System.out.println("Read data 2");
        int len = System.in.read(data);
        for(int i = 0; i < len - 2; i++){
            System.out.println((char)data[i]);
        }

    }
}
