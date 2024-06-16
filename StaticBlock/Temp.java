class Temp{
    int x;
    {
        System.out.println(" InIt Block");
        this.x = 10;
    }
    Temp(){
        System.out.println(" Default Constructor");
        System.out.println(x);
    }
    {
        System.out.println(" Second");
    }
    Temp(int x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        new Temp();
        new Temp(10);
        new Temp();
    }
}