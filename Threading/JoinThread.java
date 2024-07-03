class Thread1 extends Thread {
    Thread1(String s) {
        super(s);
    }

    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
        System.out.println(getName() + "Dead-1");
    }
}

class Thread2 extends Thread {
    Thread2(String s) {
        super(s);
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
        System.out.println(getName() + "Dead-2");
    }
}

class Thread3 extends Thread {
    Thread3(String s) {
        super(s);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
        System.out.println(getName() + "Dead-3");
    }
}
class JoinThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("Thread 1");
        Thread2 t2 = new Thread2("Thread 2");
        Thread3 t3 = new Thread3("Thread 3");
        t1.start();
        t2.start();
        t3.start();
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(Exception e){
             
        } 
        for(int i = 1; i<=3;i++)
        {
            System.out.println(Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
        System.out.println(Thread.currentThread().getName()+"Dead-m");
    }
}