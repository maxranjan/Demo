interface my{
    void show();
}

interface my1 extends my{

    void play();   
}
// Here we can see that Interface are using Multiple Inheritance. 
interface my2 extends my, my1{
    void display();
}
// Class are implements multiple interfaces not multiple inheritance.
// class are not support multiple inheritance.
class Child2 implements my, my1{
    public void show(){
        
        System.out.println("  This is Show");
    }

    public void play(){
        System.out.println(" We are Playing Cricket");
    }
    public void display(){
        System.out.println(" This is Display");
    }
    public static void main(String[] args) {
        my m = new Child1();
        m.show();
        my1 m1 = new Child1();
        m1.play();
        my2 m2 = new Child1();
        m2.display();
    }
}