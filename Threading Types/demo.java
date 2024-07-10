public class demo {
 static   void max() {
        System.out.println(" Hey you are CCCCCCCCCC");
    }
}

class max extends demo {
   static void max() {
        System.out.println(" nooooooooooooo");
    }

    public static void main(String[] args) {
        demo m1 = new max();
        m1.max();
    }
}