public class MEERAS {
    void meth1(int a, int b) // called by main meth
    {

        System.out.println(a + b);

    }

    int meth2(int m) // called by main meth
    {
        System.out.println(m);
        return 30;
    }

    public static void main(String[] args) {
        int a = 23;
        int b = 30;
        int c = a++; // a=24, c= 23
        int d = a++ + b++ + ++c;// a=25, b= 31, c= 24, d = 24+30+24=78
        int e = a++ + b++ + --c + d--; // a= 26, b= 32, c= 23 , d 77, e = 25+31+23+78=157
        int sum = e-- + --c + b + a-- + c++;// e= 156, c= 22, b=32, a=25, c=24, sum= 157+22+32+25+23
        System.out.println(sum);
        MEERAS obj = new MEERAS();
        obj.meth1(10, new MEERAS().meth2(20));

    }

}
