class chain2 {
    chain2() {
        this("Nicky Ranjan");
        System.out.println(" This is the first constructor");
    }
    chain2(String s) {
        this(20);
        System.out.println(" This is the second constructor");
        System.out.println(s);
    }
    chain2(int x)
    {
        System.out.println(x);
      
    }

    public static void main(String[] args) {
        new chain2();
    }
}
