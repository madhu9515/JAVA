public class FuzzyLogic {
    public float TML(float x,float a,float b,float c){
        if(x<a){
            return 0; 
        }
        else if(a<=x && x<=b){
            float A=(x-a)/(b-a);
            return A;
        }
        else if(b<x && x<=c){
            float B=(c-x)/(c-b);
            return B;
        }
        else if(c<x){
            return 0;
        }
        else{
            return 0;
        }

    }
    public static void main(String[] args) {
        FuzzyLogic fl=new FuzzyLogic();
        float a=10;
        float b=50;
        float c=90;
        float[] Array={10,20,30,40,50,60,70,80,90};
        for(int i=0;i<Array.length;i++){
            System.out.println(fl.TML(Array[i], a,b,c));
        }
        
    }
    
}