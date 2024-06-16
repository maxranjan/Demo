class init1 {
    {
        System.out.println(" This is Init Block");
    }

    init1() {
        System.out.println(" This is the First Constructor");
    }

    init1(int x) {
        System.out.println(" This is the second parameteries constructor");
    }

    public static void main(String[] args) {
        new init1();
        new init1(20);
    }
}
