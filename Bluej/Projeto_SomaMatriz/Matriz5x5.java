public class Matriz5x5{
    int[][] matrizA = new int[5][5];
    public void leitura(){
       for (int i = 0; i < matrizA.length; i++) {
            System.out.println();
            for (int j = 0; j < matrizA.length; j++) { 
                matrizA[i][j]=Input.readInteger();  
            } 
        }
    }
    
    public int somaImpares(){
       int soma=0;
       for (int i = 0; i < matrizA.length; i++) { 
          for (int j = 0; j < matrizA.length; j++) { 
             if( (matrizA[i][j]%2!=0)){
                 soma= soma + matrizA[i][j];
             }
          } 
       }
       return soma;
    }
    
    public void somaColunas(){
        for(int i=0; i<matrizA.length; i++){//coluna
            int soma=0;
            for (int j = 0; j < matrizA.length; j++){
                soma=soma+matrizA[i][j];
            }
        System.out.println("Soma da coluna "+i +" = " +soma);    
        }
    }
    
    public void somaLinha(){
        for(int i=0; i<matrizA.length; i++){//coluna
            int soma=0;
            for (int j = 0; j < matrizA.length; j++){
                 soma=soma+matrizA[j][i];
            }
        System.out.println("Soma da linha "+i +" = " +soma);    
        }
    }
        
        
        
        
        
        
    
}