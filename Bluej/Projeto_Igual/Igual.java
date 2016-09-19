import java.util.*;
public class Igual{
    public static void main(String args[]){
        int i;
        
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
    
        for (i=0; i<vet1.length; i++){
            System.out.println ("Entre com os elementos do vetor 1: "+i);
            vet1[i] = Input.readInteger();            
        }
        
        System.out.println("-------------------------------------------------------");
        
        for (i=0; i<vet2.length; i++){
            System.out.println ("Entre com os elementos do vetor 2: "+i);
            vet2[i] = Input.readInteger();            
        }
        
        System.out.println("-------------------------------------------------------");
        
        boolean result = Arrays.equals(vet1, vet2);
        
        if (result == true){
            System.out.println("Resultados iguais");
        }else{
            System.out.println("Resultados diferentes");
        }                
    }
}