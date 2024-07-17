import java.io.*;

public class DataRead {
    public static void main(String[] args) throws IOException {
        DataInputStream din = new DataInputStream(new FileInputStream("appsquadz.txt"));

        String s = " ";
        while (s != null) {
            s = din.readLine();
            if (s != null)
                System.out.println(s);
        }
        din.close();
    }
}
