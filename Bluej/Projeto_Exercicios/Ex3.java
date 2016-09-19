public class Ex3{
   public static void main(String args[]){
       float s = 0;
       int n = 470;
	for ( int i = 7 ; i <= 27 ; i++) {
  	  s=s+(n/i);
          n= n - 10;
	}
         System.out.print("resultado = "+s);
 }		
}