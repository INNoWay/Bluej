
public class Nota_Aluno{

    public static void main(String args[]){

    int [] nota = new int[10];
    int x=0;
    int y=0;
    int b=0;
    for(int i=0 ; i<nota.length ; i++){
        
     System.out.println("Entre com as nota dos alunos");
     nota[i]=Input.readInteger();
     
     x=x+nota[i];       
    }
    y=x/10;
    
    System.out.println("Media da sala: "+y); 
    }

}
