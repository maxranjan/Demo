
import java.io.*;

public class DataStream2 {
    public static void main(String[] args) throws IOException {
        DataInputStream fin = new DataInputStream(System.in);
        FileOutputStream fout = new FileOutputStream("appsquadz.txt");

        PrintStream ps = new PrintStream(fout);
        String s = " ";
        
        while (!s.equals("stop")) {
            s = fin.readLine();
            ps.println(s);
        }
        fin.close();
        fout.close();

    }
}
