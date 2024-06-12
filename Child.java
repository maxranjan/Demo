/*
--------------------------------------------------------------------------
In This Program ! Abstract Does Not Required At least One Abstract Method 

abstract class Base{
    int x;
    int y;
    void show(){
        System.out.println(x);
        System.out.println(y);
    }
}
class Child extends Base{
    void get(int x , int y){
        this.x = x; 
        this.y = y;
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.get(10,23);
        c.show();
    }
}
-------------------------------------------------------------------------------    

// Abstraction Only achieved and Overiding by Inheritance 

abstract class Base {
    int x;
    int y;

    void show() {
        System.out.println(x);
        System.out.println(y);
    }
    abstract void display();
}

class MyRegister{
    void register(Base b) {
        b.display();
    }
}

class Child extends Base {
    void get(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void display(){
        System.out.println("Display");
    }

    public static void main(String[] args) {
        Child c = new Child();
       MyRegister m1 = new MyRegister();
       m1.register(c);
    }
}

---------------------------------------------------------------------------------------------
// Books Describe Like this.....

abstract class Base{
    int x;
    int y;
    void show(){
        System.out.println(x);
        System.out.println(y);
    }
    abstract void display();
}
class Child extends Base{
    void get(int x , int y){
        this.x = x; 
        this.y = y;
    }
    void display(){
        System.out.println("Display");
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}

*/