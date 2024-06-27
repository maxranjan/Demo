/*Creating format strings:
 * You have printf() and format() methods to print output with formatted numbers. the string class has an 
 * equivalent class method, format(), that returns a string objects rather than a PrintStream object 
 */

public class Format {
    public static void main(String[] args) {
        float floatVar = 2.4f;
        int intVal = 10;
        String stringVal = "HINDUSTAN";
        System.out.printf(
                "The value of float is %f, while the value of the integer variable is =%d, and the string is = %s",
                floatVar, intVal, stringVal);
        
                String fs = String.format("The value of float is = %f, while the value of the integer variable is =%d, and the string is =%s", floatVar,intVal,stringVal);
                System.out.println(" ");
                System.out.println(fs);
    }

}
