
public class Gera_Vetor{

    public static void main(String args[]){

int y []= new int [15];
int x []= new int [15];



for (int i=0 ; i < y.length ; i++){
System.out.println("Entre com numero");
x[i]= Input.readInteger();
if (i % 2 == 0){
y[i]=x[i]*2;
}
    else{
        y[i] = x[i]*3;
    }
    
        System.out.println("resultado"+y[i]);
    


    }
  }
}


