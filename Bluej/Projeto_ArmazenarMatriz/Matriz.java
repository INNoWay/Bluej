public class Matriz{
    public static void main(String args[]){
        int i, j;
        int [][] matrizA = new int[3][3];    
        int [][] matrizB = new int[3][3];
        int [][] matrizC = new int[3][3];
        
        for(i=0; i<matrizA.length; i++){
            for(j=0; j<matrizB.length; j++){
                System.out.println("Valores de A");
                matrizA[i][j] = Input.readInteger(); 
                System.out.println("Valores de B");
                matrizB[i][j] = Input.readInteger();
            }   
        } 
        
         for(i=0; i<matrizA.length; i++){
            for(j=0; j<matrizB.length; j++){
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.println("Matriz C é igual " + matrizC[i][j]);               
            }
        }
    }
}