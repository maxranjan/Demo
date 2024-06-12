class Base{
    private int x = 10;

void show(){
    System.out.println(x);
}
}
class Child1 extends Base {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.show();
    }
    
}