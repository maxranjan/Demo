/*
---------------------------------------------------------------------------------------------------------------------------------------------
package p1;
// We can add more than one class in a single class. but we never use it outside of the class.
class Temp1{
    void show(){
        System.out.println(" This is Temp 1");
    }
    class Temp2{
        void show(){
            System.out.println(" This is Temp 2");
        }
    }
    public static void main(String[] args) {
        new Temp1().show();
        new Temp2().show();
    }
    // When we compile [java -d . Temp1.java] then it will be created automaticlly in current location.
    // If we want to create on another places then we have to type [javac -d <Drive with folder name> . Temp1.java].
}
---------------------------------------------------------------------------------------------------------------------------------------------

package p1;
// class and method must be public in this.
public class Temp1{
    public void show(){
        System.out.println(" This is Temp 1");
    }
    // We cannot make two public class in a single class.
    //  public class Temp2{ This is error
        class Temp2{
        void show(){
            System.out.println(" This is Temp 2");
        }
    }
    public static void main(String[] args) {
        new Temp1().show();
        new Temp2().show();
    }
}
    -----------------------------------------------------------------------------------------------------------------

// HOW TO IMPORT PACKAGES 
---------------------------------------------------------------------------------------------------------------------
import p1.Temp1;
public static void main(String[] args) {
    new Temp1().show();
}
*/