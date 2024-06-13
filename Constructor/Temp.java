package Constructor;
class Temp {
// It is a Instance Data Members.
    int x; 
    int y;
// Constructor of Temp class, Constructor name is same as well as class name. Here the temp is constructor. 
    Temp() {
        x = 10;
        y = 20;
    }
void display(){
    System.out.println(x);
    System.out.println(y);
}
public static void main(String[] args) {
    Temp t1 = new Temp();
    t1.display();
    // we can create more the one objects.
    Temp t2 = new Temp();
    t2.display();
}
}