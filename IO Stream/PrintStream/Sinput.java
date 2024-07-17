import java.io.*;
import java.util.*;

class Sinput {
    public static void main(String[] args) throws IOException {

        SequenceInputStream sin = new SequenceInputStream(new MyEnum());

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

class MyEnum implements Enumeration {
    InputStream in[];
    int i = -1;

    MyEnum() {
        try {
            in = new InputStream[] { new FileInputStream("chacha48.txt"), new FileInputStream("chachi.txt"),
                    new FileInputStream("pss.txt") };
        } catch (Exception e) {
        }
    }

    @Override
    public boolean hasMoreElements() {
        if (++i < in.length) {
            return true;
        } else {
            return false;
        }
    }

    public Object nextElement() {
        System.out.println("hasMoreElements");
        System.out.println("NextElement" + i);
        return in[i];
    }
}
