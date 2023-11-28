public class ClassA {
    void meth1() {
        System.out.println(10);
        System.out.println(64);
        System.out.println("End");
    }

    int meth2(int a, int b, int c) {
        System.out.println(a);
        ClassA obj = new ClassA();
        String s = obj.meth5(100, "java");
        System.out.println(s);
        return a - b;
    }

    String meth3(String s, int b, int d) {
        System.out.println(b + d);
        return s;
    }

    int meth4(int c, int k) {
        System.out.println(k);
        ClassA obj = new ClassA();
        int result = obj.meth2(50, 50, 50);
        return k + 10;
    }

    String meth5(int a, String L) {
        System.out.println(a + a);
        ClassA obj = new ClassA();
        String s = obj.meth3("Hi", 15, 10);
        System.out.println(s);
        return L;
    }

    public static void main(String[] args) {
        ClassA obj = new ClassA();
        System.out.println("Start");
        int result = obj.meth4(20, 10);
        System.out.println(result);
        obj.meth1();
    }

}
