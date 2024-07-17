import java.io.*;
public class DataStream {
    public static void main(String[] args) throws IOException {
        DataInputStream din = new DataInputStream(System.in);
        FileOutputStream fout = new FileOutputStream("appsquadz.txt");
        DataOutputStream dout = new DataOutputStream(fout);

        String s = " ";
        while(!s.equals("stop")){
            s = din.readLine(); 
            System.out.println(s);
           dout.writeBytes(s); // it read a string [Example - Ram Shyam] 
            //dout.writeUTF(s); // it read and show in incripted form [Example - @#$%%%#a@#$] 
            //dout.writeChars(s); // it read only character [Example - A B C D]
            dout.flush();            
        }
        din.close();
        dout.close();
    }
}
