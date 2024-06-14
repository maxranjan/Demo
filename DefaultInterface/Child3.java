interface my{
    int x = 10;
}
interface my1
{
    int x = 10;
}
class Child3 implements my,my1{
public static void main(String[] args) {
    System.out.println(my.x);
    System.out.println(my1.x);
    // In this situation Compiler will be comfused. they cannot find which interface will be execute because both have same. 
    // System.out.println(x); 
    // my.x =1000;
}
}