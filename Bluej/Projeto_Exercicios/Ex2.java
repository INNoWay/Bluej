public class Ex2{
   public static void main(String args[]){
       int s = 0; 
   System.out.print("Entre Com um numero: ");
   int n = Input.readInteger();
	for ( int i = 0 ; i <= n ; i++) {
	  s=s+(n-i);
	}
         System.out.println("resporta = "+s);
 }		
}   