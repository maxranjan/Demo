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

    void show(String s, int a) {
        x = a;
        System.out.println("Starting show -  " + s + " " + x);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println("Ending show -  " + s + " " + x);
    }

    void show1(String s, int a) {
        System.out.println("Starting Show -1 " + s);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println("Ending show - 1  " + s);

    }

    void show2(String s, int a) {
        System.out.println("starting show - 2" + s);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println("Ending show - 2" + s);

    }
}

/*
 * void show2(String s, int a) {
 * System.out.println("Starting in method" + s);
 * synchronized (this) {
 * x = a;
 * System.out.println("starting in block" + s + " " + x);
 * try {
 * Thread.sleep(2000);
 * } catch (Exception e) {
 * }
 * System.out.println("Exit from block" + s + " " + x);
 * 
 * }
 * }
 * }
 * 
 * Temp t = new Temp();
 * 
 * void show3(String s, int a) {
 * System.out.println("Staring method " + s);
 * synchronized (t) {
 * t.DilToPagalHai(s);
 * }
 * }
 * 
 * synchronized void show4(String s, int a) {
 * x = a;
 * System.out.println(" Starting in method" + s + " " + x);
 * Thread.currentThread().suspend();
 * Thread.currentThread().resume();
 * System.out.println("Exit from method" + s + "" + x);
 * }
 * }
 * 
 * class Temp {
 * void DilToPagalHai(String s){
 * System.out.println(" Staring ha mai hooo pagal in dil to pagal hai"+"  "+s);
 * try{
 * Thread.sleep(2000);
 * }catch(Exception e){}
 * System.out.println("Ending from dil to pagal hai"+" " + s);
 * }
 * }
 * 
 */