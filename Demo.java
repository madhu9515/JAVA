
public class Demo {
    void meth1() {
        int i = 10;
        int j = 20;
        System.out.println(i);
        System.out.println(j);
        Demo obj = new Demo();
        obj.meth2();
        System.out.println(i * j);
    }

    void meth2() {
        System.out.println("hello");
        int a = 5;
        int b = 4;
    }

    public static void main(String[] args) {
        System.out.println("HI");
        Demo obj = new Demo();
        obj.meth1();

    }

}
