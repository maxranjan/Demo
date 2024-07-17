import java.io.*;
class MyClint1 {
    ObjectOutputStream dout; // Its a instance data member of ObjectOutputStream.
    public MyClint1() {
        try {
            Emp e1 = new Emp("Nicky Ranjan", 023, 010, 020, 030);
            dout = new ObjectOutputStream(new FileOutputStream("appSquadz.txt"));
            dout.writeObject(e1);
            dout.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

   //  Base b =  new Base();
    
    public static void main(String[] args) {
        new MyClint1();
    }
}


