// Note : " Instance Data Member of parent class will be moved in child class"
// Note : " Parent class Object never be created at Implicitly but it can be
// created Explicetly"

class Papa {
    int x; // It is the Instance Data Member of Parents Clsss
    int y; // It is the Instance Data Member of Parents Clsss

    void show() {
        System.out.println(x);
        System.out.println(y);
    }
}

class Base extends Papa {

    void get(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Base c1 = new Base();
        c1.get(10, 20);
        c1.show();
    }
}

