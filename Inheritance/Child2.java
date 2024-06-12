class Dadaji{
    int x = 80;
}
class Papaji extends Dadaji{
    int x = 50;
}

class Child2 extends Papaji {
    int x = 20;
    void show()
    {
        System.out.println(x);
        System.out.println(super.x);
        System.out.println(((Dadaji)this).x);
        System.out.println(((Papaji)this).x);
    }
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        c2.show();
        System.out.println(((Dadaji)c2).x);
    }
}
