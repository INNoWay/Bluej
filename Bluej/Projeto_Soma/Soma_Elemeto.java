
public class Soma_Elemeto{
   public static void main(String[] args){ 
      double A[] = {0,1,2,3,4,5,6,7,8,9};      
      double C=0;
      
      for (int i=0; i<A.length; i++) {   
         C = C + A[i];
         System.out.println("Elemento: "+C);
      }
      
       System.out.println("resultado Final: "+C);
  
   } 
} 

