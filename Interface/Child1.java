interface my{
    void show();
}
// we can extend one interface to another interface. In example my1 extends my.
interface my1 extends my{
// Here the both method are same but no Error in the programs because 
// In interface we can create same method in interface and also to be extends.
    public void show();   
}
// we can implement more than one interface in our child class. Like my, my1.
class Child1 implements my, my1{
    public void show(){
        
        System.out.println(" This is the last Child class");
    }
    public static void main(String[] args) {
        my m = new Child1();
        m.show();
        my1 m1 = new Child1();
        m1.show();
    }
}