class B1{
    final int x;
    B1(int z){
        //x=0; (This line is inserted by the compiler) 
        //System.out.println(x); Error
        x=z;
        System.out.println(x);
    }
    public static void main(String[] args) {
        B1 b = new B1(20);
        // b1.x = 2000; We cannot change Value in Case of final.
        B1 b1 = new B1(200);
    }
}