public class Ex6{
   public static void main(String args[]){
       float valor;
       int bala;
       System.out.print("digite a quantidade de balas:"); 
       bala=Input.readInteger();
       if (bala<=11){
         valor = 0.30f;
       }
       else if (bala>=12 && bala <=23){
              valor = 0.25f;
            }else {valor = 0.20f;
             }
        
         valor = valor*bala;
         System.out.print("valor total da compra:"+valor);
 }		
}