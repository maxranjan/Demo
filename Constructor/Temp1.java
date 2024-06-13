// Constructor Using data Showding
class Temp1 {
    int x = getX(); // getX(); is a method. 

    int getX() {
        System.out.println(x);
        return 10;
    }
    Temp1(){
        x = getX();
        System.out.println(x);
    }
    public static void main(String[] args) {
        Temp1 t1 = new Temp1();
    }
}