import java.util.Scanner;
public class ClassLevelArray {

    int z[];
    public static void main(String[] args) {
        System.out.println("Enter the size of an array");
       int  x1 = new Scanner(System.in).nextInt();
       ClassLevelArray o1 = new ClassLevelArray();
       o1.z = new int[x1];

       Class c = o1.z.getClass();
       System.out.println(c.getName());

       for(int i= 0; i<o1.z.length; i++ ){
        o1.z[i] = new Scanner(System.in).nextInt();
       }
       for( int i =0; i<o1.z.length;i++){
        System.out.println(o1.z[i]);
        System.out.println(" ");
       }
       System.out.println(" ");
       for(  int x : o1.z){
        System.out.println(x);
        System.out.println(" ");
       }


    }
}