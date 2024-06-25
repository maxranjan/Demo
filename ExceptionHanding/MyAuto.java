class MyAuto{
public static void main(String... s) {
try(Demo d = new Demo(); Demo1 d1 = new Demo1())   
{
    //System.exit(0);
    int  x = 10/0;
    d.show();
    d1.show();
} 
catch(ArrayIndexOutOfBoundsException e)
{
    System.out.println(e);
}
}
}

class Demo implements AutoCloseable{
    void show()
    {
        System.out.println("Show From 1");
    }
    public void close()
    {
        System.out.println("Close from Demo 1");
    }
}

class Demo1 implements AutoCloseable{
     void show()
     {
        System.out.println(" Show From 2 ");
     }
     public void close()
     {
         System.out.println("Close from Demo 2");
     }
}