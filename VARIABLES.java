public class VARIABLES {
    int a = 10;
    static int b = 20;

    void meth1() {
        int a = 15;
        System.out.println(a);
        System.out.println(b);
        System.out.println(new VARIABLES().a);
        VARIABLES obj = new VARIABLES();
        obj.meth2();

    }

    void meth2() {
        System.out.println(a);
        System.out.println(new VARIABLES().b);
    }

    public static void main(String[] args) {
        System.out.println("Start");
        VARIABLES obj = new VARIABLES();
        obj.meth1();
        System.out.println("End");
    }

}