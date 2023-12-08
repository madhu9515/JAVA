public class HANEEF {
    int i;
    byte b;
    short s;
    long l;
    float f;
    double d;
    char c;
    boolean flag;

    void meth1() {
        System.out.println(i);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(flag);
        HANEEF obj = new HANEEF();
        obj.meth2();

    }

    void meth2() {
        int i1 = 10;
        int i2 = 20;
        int i3 = i1 + i2;
        System.out.println(i3);
        byte b1 = 19;
        byte b2 = 29;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);

    }

    public static void main(String[] args) {
        HANEEF obj = new HANEEF();
        obj.meth1();

    }
}