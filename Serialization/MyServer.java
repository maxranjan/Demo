import java.io.*;

public class MyServer {
    ObjectInputStream dis;

    public MyServer() {
        try {
            dis = new ObjectInputStream(new FileInputStream("appSquadz.txt"));
            Emp z = (Emp) dis.readObject();
            System.out.println("Name : -" + z.name);
            System.out.println("age : - " + z.age);
            System.out.println("A : - " + z.a);
            System.out.println("B : - " + z.b);
            System.out.println("Z : - " + z.z);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new MyServer();
    }
}
