public class Ex1{
   public static void main(String args[]){
       int s = 0; 
   System.out.print("Entre Com um numero: ");
   int n = Input.readInteger();
	for ( int i = 1 ; i <= n ; i++) {
	  s=s+(i*i);
	}
         System.out.println("resposta = "+s);
 }		
}   
