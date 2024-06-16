class Chain1 {
    Chain1() {
        this(10);
        System.out.println("This is the first const.");
    }

    Chain1(int x) {
        this(10, 20);
        System.out.println("This is the second constructor.");
    }

    Chain1(int x, int y) {
        int c = x + y;
        System.out.println("The sum of X and Y is:- "+ c);
    }

    public static void main(String[] args) {
        new Chain1();
    }
}