public class TestaMatriz{
    public static void main(String args[]){
       Matriz5x5 matriz1;
       matriz1= new Matriz5x5();
       System.out.print("Entre com os valores Valores");
       matriz1.leitura();
       matriz1.somaImpares();
       System.out.println("________________________________________");
       System.out.println("Soma dos impares é: "+matriz1.somaImpares());
       System.out.println("________________________________________");
       matriz1.somaColunas();
       System.out.println("________________________________________");
       matriz1.somaLinha();
       System.out.println("________________________________________");        
    }
}