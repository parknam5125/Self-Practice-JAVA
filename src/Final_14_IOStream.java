import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Final_14_IOStream {
    public static void main(String[] args) throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        OutputStreamWriter os = new OutputStreamWriter(System.out);

        int read = is.read();
        os.write((char)read);

        is.close();
        os.close();
    }
}
