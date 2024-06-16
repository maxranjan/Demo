class A{
    A(){
        // super()       Implicite super() Inserting by the compiler.
    System.out.println("A");
    }
}
class B extends A{
    B(int x)
    {
        //super()         Implicite super() Inserting by the compiler.
        System.out.println(x);
    }

    B()
    {
        //super()         Implicite super() Inserting by the compiler.
        System.out.println("B");
    }
}

class C extends B{
    C(){
       // super(10);
        this(10);
        System.out.println("C");
    }
    C(int x){
        //super()         Implicite super() Inserting by the compiler.
        System.out.println(x);
    }

    public static void main(String[] args) {
        // new C();
        new C(12);
    }

}
