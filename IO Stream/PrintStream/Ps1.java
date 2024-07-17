import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class Ps1 {
public static void main(String[] args) throws IOException {
    FileOutputStream fout = new FileOutputStream("pss.txt");
    PrintStream ps = new PrintStream(fout);
    ps.println("hello");
    ps.println("hey");
    System.out.println("File Created");
}    
}
