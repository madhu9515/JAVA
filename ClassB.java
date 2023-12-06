public class ClassB {
    void meth1(int a, int b) {
        Systtem.out.println(a);
        System.out.println(a + b);
        ClassB obj = new ClassB().meth2("hjfbkh", 10);

    }

    void meth2(String s, int c) {
        System.out.println(s);
        System.out.println("int c=20:" + c);

    }

    ClassB(int x) {
        System.out.printlm(10);

    }

    static {
        System.out.print(x);
    }

    public static void main(String[] args) {

        System.out.println("Start");
        ClassB obj = new ClassB(10);
        obj.meth1(10, 20);
    }

}