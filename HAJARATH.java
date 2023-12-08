public class HAJARATH {
    int x = 10;
    int a = 10;
    int b = 20;

    void meth1() {
        int x = 100;
        System.out.println("HAJARATH");
        HAJARATH obj = new HAJARATH();
        System.out.println(a++ + b++);
        System.out.println(++a + ++b);
        obj.meth2(10, 20, 30);
        System.out.println(x);

    }

    void meth2(int a, int b, int c) {
        System.out.println(a);
        System.out.println(a + b + c);
        System.out.println(a++);
        System.out.println(b++);
        System.out.println(c);
        System.out.println(x);
        HAJARATH obj = new HAJARATH(10, 29);

    }

    HAJARATH() {
        System.out.println("AMEENA");

    }

    HAJARATH(int a, int b) {
        System.out.println(a + b);
    }

    static {
        System.out.println("START");

    }

    void meth3() {

    }

    public static void main(String[] args) {
        System.out.println("MEERAZ");
        HAJARATH obj = new HAJARATH();
        obj.meth1();
        System.out.println("END");

    }

}