class BlankFinalvariable{
final int x = getX();
int getX(){
    System.out.println(x+" Via Get Function");
    return 10;
}
BlankFinalvariable()
{
    // x =0; inserted by the compiler
    // x =getX();
    System.out.println(this.x +" Via Constructor");
}
public static void main(String[] args) {
    new BlankFinalvariable();
}
}

// In This program. after using final keyword 2 output is print. 