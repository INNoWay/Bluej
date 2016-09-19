
public class Mult_Elemento{
    
     public static void main(String[] args) {   
     
        int a[] = new int[10];   
        int b[] = new int[10];   
        int c=0;
        for (int i = 0; i < 10; i++) {   
            System.out.println("Digite os valores dos Elemento: ");   
            a[i] = Input.readInteger();
            
            System.out.println("Digite os valores a ser multiplicado: ");   
            b[i] = Input.readInteger();
            
            c = a[i] * b[i];
            
            System.out.println("A multiplicacao dos Elementos: "  +c);
        }          
              
        }   
    }   
  

