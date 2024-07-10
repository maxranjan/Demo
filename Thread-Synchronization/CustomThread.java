
class CustomThread extends Thread {
    Shared s;

    public CustomThread(Shared s, String str) {
        super(str);
        this.s = s;
        start();
    }

    public void run() {
         System.out.println("Thread1, Sum of 10 and 20 = " + s.add(10, 20)); // Int
        // add part
        // System.out.println(Thread.currentThread().getName()+" 10");
        //s.show(Thread.currentThread().getName(), 10);
    }
}

class CustomThread1 extends Thread {
    Shared s;

    public CustomThread1(Shared s, String str) {
        super(str);
        this.s = s;
        start();

    }

    public void run() {
         System.out.println("Thread2, Sum of 100 and 200 = "+ s.add(100,200));// Int
        // add part
        // System.out.println(Thread.currentThread().getName()+" 20");
       // s.show1(Thread.currentThread().getName(), 20);
    }
}

class CustomThread2 extends Thread {
    Shared s;

    public CustomThread2(Shared s, String str) {
        super(str);
        this.s = s;
        start();
    }

    public void run() {
         System.out.println("Thread2, Sum of 1000 and 2000 = " + s.add(1000, 2000));//
        // Int add part
        // System.out.println(Thread.currentThread().getName()+" 30");
       // s.show2(Thread.currentThread().getName(), 30);
    }
}
