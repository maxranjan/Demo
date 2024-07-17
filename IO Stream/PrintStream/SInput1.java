import java.io.*;

public class SInput1 {
    public static void main(String[] args) throws IOException {
        SequenceInputStream sin = new SequenceInputStream(new FileInputStream("chachi.txt"),
                new FileInputStream("chacha.txt"));
        DataInputStream din = new DataInputStream(sin);
        String s = " ";
        while (s != null) {
            s = din.readLine();
            if (s != null)
                System.out.println(s);
        }
        din.close();
    }
}