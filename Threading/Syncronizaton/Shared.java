class Shared {
    int x, y;

   synchronized int add(int a, int b) {
        System.out.println("Inside add Methods " + Thread.currentThread().getName());
        x = a;
        y = b;
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        return x + y;
    }

    synchronized void show(String s , int a)
    {
        System.out.println("Starting in Method"+s+""+x);
        try{
            Thread.sleep(2000);
        }catch(Exception e){}
        System.out.println("Exit From method "+s+""+x);
    }
  
}
