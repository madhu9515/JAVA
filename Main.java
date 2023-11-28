public class Main{
    void meth1( int x){
        System.out.println(x);
        Main obj = new Main();
        obj.meth3("hi");
        System.out.println(x+20);
    }
    void meth2( int x, int y){
    Main obj = new Main();
       obj.meth4( "hello",10);
        System.out.println(x);
        System.out.println(x+y);
        
    }
    void meth3(String s){
        System.out.println(s);
        Main obj=new Main();
        obj.meth2(10,20);

    }
    void meth4( String s, int x){
        System.out.println();
    }
    public static void main (String[]args){
        System.out.println("Start");
        Main obj= new Main();
        obj.meth1(10);
        System.out.println("End");

    }
}
