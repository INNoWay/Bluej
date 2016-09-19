import java.util.*;
public class Ex11{
    public static void main(String args[]){
        int i;        
        int[] vet = new int[5];
        
        for(i=0; i<vet.length; i++){
            System.out.println("Digite os elementos do vetor");
            vet[i] = Input.readInteger();
        }
        
        System.out.println("------------------------------------------------");
        
        Arrays.sort(vet);
        System.out.println("Qual valor deseja encontrar?");
        int busca = Input.readInteger();
        int x = Arrays.binarySearch(vet, busca);
        
         if (x>0){
           System.out.println("Numero Existe"); 
        }
        else{
            System.out.println("Numero Inexistente");
        }    
    }
}
