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