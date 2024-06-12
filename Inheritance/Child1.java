class Base {
    private int x = 10;

    /*
     * Private Data member cannot be access with child class.
     * It can only access in Parent class and method is also define in Parent
     * classes.
     */
    
    void show() {
        System.out.println(x);
    }
}

class Child1 extends Base {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.show();
    }

}