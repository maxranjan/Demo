package Interface;
// Interface parts are bydefault public and abstract. 
// but after 1.7 java interface are divided into three parts in case of interface 1. Abstract 2. Default 3. Static
interface my {
    void show();
}
class Child implements my{
// In child class void methods are always be public because our interfaces are public
    public void show(){
        System.out.println("This is the show");
    }
    public static void main(String[] args) {
// Here the case of upcasting in java.
        my m = new Child();
        m.show();
    }
}