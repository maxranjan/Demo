import java.io.*;

public class Emp extends Base implements Serializable {
    private static final long id = 1L;// We Define the SerialVersionUID then we can change any instanct data member
    transient int a; // Transiest, it cannot be serialized
    static int b;// static, It also connot be serialized
    String name;
    int age;
    int salary;
    
    Emp(String name, int age, int a, int b, int z) {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b = b;
        this.z = z;
    }
}