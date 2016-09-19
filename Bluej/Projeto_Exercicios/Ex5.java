public class Ex5{
   public static void main(String args[]){
       int n1,div;
       float result;
       System.out.print("digite o dividendo:");
       n1= Input.readInteger();
         do  {
           System.out.println("Digite o divisor:");
           div= Input.readInteger();
	     if (div == 0) {
               System.out.println("Valor nulo, didite um numero diferente de 0");
             }      
         } while (div== 0);
       result = n1 / div;
       System.out.print("resultado="+result);     
 }		
}