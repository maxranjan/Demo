import java.io.*;
public class MyClint2 {
    ObjectOutputStream dout;
    public MyClint2(){
        try {
            Emp e1= new Emp("Tarun singh negi", 023, 010, 02, 030);
            Emp e2 = new Emp("Anoj Kr Yadav", 026  , 01, 02, 03);
            dout = new ObjectOutputStream(new FileOutputStream("AppSquare.txt"));
            dout.writeObject(e1);
            dout.writeObject(e2);
            dout.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new MyClint2();
    }
}
