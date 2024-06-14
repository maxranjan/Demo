interface my{
// If Member function is not static then it is Public and Abstract in Interface.
    void show();
}
class Temp{
    public void show()
    {
        System.out.println("This is the Temp");
    }
}

class Child2 extends Temp implements my{
    // toString() is a Non static Method on an Object Class.
    public String toString(){
        return "Hello";
    }
    public static void main(String[] args) {
        my m = new Child2();
        m.show();
        System.out.println(m.toString());
    }
}