import java.io.*;

class MyFileWriter {
    public static void main(String[] args) throws IOException {
        // FileOutputStream fw = new FileOutputStream("Lalu.txt"); // To Write Mode
        FileOutputStream fw = new FileOutputStream("Lalu.txt", true); // To Append
        // Mode
        // FileOutputStream fw = new FileOutputStream("F:\\F2/Lalu2.txt"); // To Write
        // Mode
        // FileOutputStream fw = new FileOutputStream("Lalu.txt",true); // To Append
        // Mode

        String s = "Hey !! What's Up Bro, How Are You. ";
        byte ch[] = s.getBytes();
        // fw.write(ch);
        for (int i = 0; i < ch.length; i++)
            fw.write(ch[i]);
        fw.close();
        System.out.println("File Created Successfully");

    }
}
// This Method is Read the Lalu.txt file and show the all text in the terminal Screen after reading.
class MyFileReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fr = new FileInputStream("Lalu.txt");
        int i = 0;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }
}

// This method is used to read the text which is available in Lalu.txt File. If
// nothing is available in Lalu.txt File then its nothing to print
class MyFileReader1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fr = new FileInputStream("Lalu.txt");
        byte b[] = new byte[fr.available()];
        fr.read(b);
        String s = new String(b);
        System.out.println(s);
        System.out.println(s.length());
    }
}