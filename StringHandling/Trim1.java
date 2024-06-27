public class Trim1 {
    public static void main(String[] args) {
        String Str = new String("   welcome to Tutoraials of String   ");
        System.out.println(Str);

        System.out.println("Before Value"+Str.length());
        System.out.println("Return Values:");

        String z = Str.trim();
        System.out.println(z);

        System.out.println("After Trim"+z.length());

    }
    
}
