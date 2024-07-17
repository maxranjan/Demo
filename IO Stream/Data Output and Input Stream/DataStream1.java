import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class DataStream1 {
public static void main(String[] args) throws IOException {
    // FileOutputStream is used to ride the data in the given txt file.......................
    FileOutputStream fout = new FileOutputStream("codesquadz.txt"); // This line is used to create a new file in current address.
    DataOutputStream dout = new DataOutputStream(fout);//This line is used connect the file.
    dout.writeInt(10);
    dout.writeLong(10l);
    dout.writeBoolean(false);
    dout.writeDouble(01.55);
    dout.close();

    FileInputStream fin = new FileInputStream("codesquadz.txt");
    DataInputStream din = new DataInputStream(fin);
    int i = din.readInt();
    long l = din.readLong();
    Boolean b = din.readBoolean();
    Double d = din.readDouble();
    System.out.println(i);
    System.out.println(l);
    System.out.println(b);
    System.out.println(d);
}    
}
