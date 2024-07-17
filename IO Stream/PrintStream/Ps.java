import java.io.*;
public class Ps {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("chachi.txt");
        PrintStream ps = new PrintStream(fout);

        FileOutputStream fout1 = new FileOutputStream("chacha.txt",true);
        PrintStream ps1 = new PrintStream(fout1);

        System.out.println("Before");
        PrintStream ps4 = System.out;
        System.setOut(ps);
        System.out.println("Chachi 420");
        System.out.println("Chachi Abb 840 Ho gyi Bhai");

        System.setErr(ps1);
        System.err.println("Chacha 240");
        System.err.println("Chacha 440 Ho gye Bhai");

        System.setOut(ps1);
        System.out.println("Chacha 2400");

       // System.out = ps4; --- We cannot change again the ps4 value in System.out because its a final;
        
        System.setOut(ps4);
        System.out.println("After");
        System.out.println("Via a Actual Out");



    }
}
