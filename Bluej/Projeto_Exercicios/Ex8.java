public class Ex8{
   public static void main(String args[]){
       float altura=0,maior=0,media=0,menor=3f;
       int numerodemulheres=0,h=1;
       String sexo;
       for (int i=1; i<= 5; i++){
	 do  {
           System.out.println("digite seu sexo F ou M:");
           sexo=Input.readString();
           System.out.println("digite a altura");	 
           altura=Input.readFloat();
	     if(sexo.equals("f")){
	       media= media +altura;
	       numerodemulheres++;
             }else if(sexo.equals("m")){
                     h++;
                   }else {System.out.println("digite m para masc. ou f para fem.");
                    }      
         } while(!(sexo.equals("m")) || !(sexo.equals("f"))); 
	 if (altura >= maior) {
           maior = altura;
         }else if (altura <= menor) {
	         menor = altura;
               }
       }
       if (media != 0){
	 media=media/numerodemulheres;
         System.out.println("Media das mulheres:"+media);
       }else {System.out.print("nao tem mulheres:");
        }
       System.out.println("Maior altura:"+maior);
       System.out.println("Menor altura:"+menor);
       System.out.println("numero de homens:"+h);

 }     	
}