public class Ex7{
   public static void main(String args[]){
       float media;
       int n=0,cont=0,idade;
       System.out.print("digite a idade:");
       idade=Input.readInteger();        
       while (idade != 0) {
         n=n+idade;
         cont++;
         System.out.println("n="+n);
         System.out.println("cont="+cont);
         System.out.print("digite a idade:");
         idade=Input.readInteger();
       } 
       media=n/cont;
       System.out.print("Media das idades:"+media);
 }		
}