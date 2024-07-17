import java.io.*;

public class MyByteWriter {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream fw = new ByteArrayOutputStream();
        String s = "India is a good country h ";
        byte ch[] = s.getBytes();
        for (int i = 0; i < ch.length; i++)
            fw.write(ch[i]);
        fw.writeTo(new FileOutputStream("rabri.txt"));
        fw.writeTo(new FileOutputStream("rabri1.txt"));
        System.out.println("File create Successfully");

       /* System.out.println(fw.toString());
        byte z[] = fw.toByteArray();
        ByteArrayInputStream fr = new ByteArrayInputStream(z);
        int i = 0;
        System.out.println((char) i);*/
    }
}
