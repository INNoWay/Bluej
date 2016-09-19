public class Classe{
   int[][] matrizA = new int[5][5];
    public void leitura(){
       for (int i = 0; i < matrizA.length; i++) {
           System.out.println();
           for (int j = 0; j < matrizA.length; j++) { 
               matrizA[i][j]=Input.readInteger();  
           } 
       }
   }
   
    public void escrita(){
        for( int i=0; i<=4; i++){
            System.out.println();
            for (int j=4; j>=0; j--){
            System.out.print(""+matrizA[j][i] +" ");
            }
        }
   }
}