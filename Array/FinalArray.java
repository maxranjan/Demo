import java.util.*;

public class FinalArray {

    public static void main(String[] args) {
        // If we make final array then we cannot be change Or Update.(Ex :- Z[] It is not Change)
        // But we can change or Update the value of an array.(Ex :- z[]={10,20,30} We can change it.)
        final int z[] = { 10, 20, 30 };
        System.out.println(z[0]);
        z[0] = 500;
        System.out.println(z[0]);

        // int y[]={10,20,30};
        // z=y; We cannot change it.
        // System.out.println(z[0]);

    }
}