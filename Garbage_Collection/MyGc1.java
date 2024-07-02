public class MyGc1 {
    static MyGc1 z1;
    int x;

    public void finalize() throws Throwable {
        System.out.println("Finalize Method");
        z1 = this;
    }

    public static void main(String[] args) {
        MyGc1 m = new MyGc1();
        System.out.println(m);
        m.x = 30;

        m = null;
        for (int i = 1; i <= 2000; i++) {
            System.gc();
        }
        System.out.println(z1);
        System.out.println(z1.x);

        z1 = null; // Z1 is ajay and amar because it cannot remove 

        for (int i = 1; i <= 2000; i++) {
            System.gc();
        }
    }
}
