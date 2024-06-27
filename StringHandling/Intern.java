public class Intern {

public static void main(String[] args) {
    String Str1 = new String("Welcome to Tutorials");
    String Str2 = new String("WELCOME TO TUTORIALS OF STRING");

    System.out.println("Canoncial Representation:");
    System.out.println(Str1.intern());

    System.out.println("Canoncial Representation:");
    System.out.println(Str2.intern());
}
    
}
