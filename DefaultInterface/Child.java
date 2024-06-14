

interface my{
// Default Define Body in Interface.
    default void show(){
        System.out.println("This is  MY");
    }
}
interface my1{
    default void show(){
        System.out.println("This is  MY 1");
    }
}
class Child implements my, my1{
    public void show(){
        System.out.println("This is Child");
    }
    public static void main(String[] args) {
        my m = new Child();
        m.show();
        my1 m1 = new Child();
        m1.show();
    }
}