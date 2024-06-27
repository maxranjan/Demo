/*public int indexOf(int ch )
 * public int indexOf(int ch , int fromIndex)
 * int indexOf(String srt)
 * int indexOf(String str, int fromIndex)
 */


public class IndexOf {
    public static void main(String[] args) {
    String Str = new String("Welcome to the Tutorials");        
    String SubStr1 = new String("Tutorials");
    String SubStr2 = new String("sutorials");

    System.out.println("Found Index");
    System.out.println(Str.indexOf('o')); //4

    System.out.println("Found Index");
    System.out.println(Str.indexOf('o',5));//9

    System.out.println("Found Index");
    System.out.println(Str.indexOf(SubStr1));

    System.out.println("Found Index");
    System.out.println(Str.indexOf(SubStr2,15));

    System.out.println("Found Index");
    System.out.println(Str.indexOf(SubStr2));

    }
    
}
