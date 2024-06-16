class Base{
    int x = 20;
    void show(){
        System.out.println(" Base");
    }
}
class child1 extends Base{
    int x = 10;
    void show()
    {
        System.out.println(" Child");
    }
    void display(){
        System.out.println(" DISPLAY");
    }
    public static void main(String[] args) {
        Base B = new child1(); // Upcasting
        B.show();
        child1 c = (child1)B; // Downcasting
        c.display();
        System.out.println(B.x);        
        System.out.println(c.x);
    }
}