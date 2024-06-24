import java.util.*;

class ClassLevelArray1 {
    public static void main(String[] args) {
        // Note :- We want to define the size of an array normally.

        // int z[]= new int[10]; Here the define the size of an array.
        // int z[] = {10,20,30}; Here initilize the size of an arraay.

        // Note:- We can take input to make the array.
        int z[];
        System.out.println("Enter the size of an array");
        int x1 = new Scanner(System.in).nextInt();
        z = new int[x1];

        for (int i = 0; i < z.length; i++) {
        // This loop is execute in every index of an array and put the value on every index.
            z[i] = new Scanner(System.in).nextInt();
        }
        System.out.println("-:Output:-");
        // This loop is for printing the all value which is present in array.
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]);
            System.out.print(" ");
        }
    }
}
