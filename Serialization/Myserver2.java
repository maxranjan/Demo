import java.io.*;

public class Myserver2 {
    ObjectInputStream dis;

    public Myserver2() {
        try {
            dis = new ObjectInputStream(new FileInputStream("AppSquare.txt"));
            Emp z = (Emp) dis.readObject();
            Emp z1 = (Emp) dis.readObject();
            System.out.println("Name = " + z.name);
            System.out.println("Name = " + z.age);
            System.out.println("Name = " + z1.name);
            System.out.println("Name = " + z1.age);
        } catch (Exception e) {

            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Myserver2();
    }
}
