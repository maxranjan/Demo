/**
 * ThreadJoinExample
 */
public class ThreadJoinExample {

    public static void main(String[] args) {
        Thread t1  = new Thread(new MyRunnable(),"t1");
        Thread t2  = new Thread(new MyRunnable(),"t2");
        Thread t3  = new Thread(new MyRunnable(),"t3");
        t1.start();
        // start second thread after waiting for 2 second or if its dead
        try{
            t1.join(2000);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        // start second thread only when t1 is successfully dead
        t2.start();
        try{
            t2.join(4000);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }

        t3.start();
        System.out.println(t1.isAlive());
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(InterruptedException e)
        {
            e.getStackTrace();
        }
        System.out.println("All Thread are dead existing main thread");
    }
}

class MyRunnable implements Runnable{
    public void run()
    {
        System.out.println("Thread Start"+ Thread.currentThread().getName());
        try{
            Thread.sleep(4000);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Thread End"+Thread.currentThread().getName());
    }
}