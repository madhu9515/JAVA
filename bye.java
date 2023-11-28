public class bye {
    public static void main (String[]args){
       int[][] matrix={{0,5,0,6,0,4,7,8},
                           {5,0,2,4,3,0,0,0},
                           {0,2,0,1,0,0,0,0},
                           {6,4,1,0,7,0,0,0},
                           {0,3,0,7,0,0,6,4},
                           {4,0,0,0,0,0,3,0},
                           {7,0,0,0,6,3,0,2},
                           {8,0,0,0,4,0,2,0}};
           for(int i=0;i<8;i++){
               for(int j=0;j<8;j++){
                   System.out.print(matrix[i][j]+" ");
               }
               System.out.println();
           }
           int[][] matrix2=new int[8][8];
           for(int i=0;i<8;i++){
               for(int j=0;j<8;j++){
                   if(matrix[i][j]==0){
                       matrix2[i][j]=1000;
                   }else{
                       matrix2[i][j]=matrix[i][j];
                   }
               }
           }
           System.out.println("copied matrix");
           for(int i=0;i<8;i++){
               for(int j=0;j<8;j++){
                   System.out.print(matrix2[i][j]+" ");
               }
               System.out.println();
           }
    }
   }
   