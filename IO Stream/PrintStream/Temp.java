import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

class Temp{
    public static void main(String[] args) throws FileNotFoundException {
        /*
        FileOutputStream fout = new FileOutputStream("Ram.txt");
        PrintStream ps1 = new PrintStream(fout);
        System.out.println("hello");
        System.setOut(ps1);
        System.out.println("hi chahci");

*/
        FileOutputStream fout = new FileOutputStream("Ram.txt");
        PrintStream ps1 = new PrintStream(fout);
        System.err.println("hello");
        System.setErr(ps1);
        System.out.println("hi chahci");


    }
}