class Temp7{
    
    static Demo d;
    static
    {
        d = new Demo();
    }
    
}

class Demo{
    void show(int x){
        System.out.println(x);
    }
}

class Temp6{
    public static void main(String[] args) {
        Temp7.d.show(10);
        System.out.println(10);
    }
}