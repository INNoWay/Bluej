public class Ex11{
	public static void main(String args[]){
	int nota;
	String nome;
	System.out.println("Entre com a nota do aluno:");
		nota=Input.readInteger();
	System.out.println("Entre com o nome do aluno:");
		nome=Input.readString();	
	if (nota>=90/100){
	System.out.println("Altamente Recomendado");
	}
	else if (nota>=80/100 && nota<90/100){
	System.out.println("Fortemente Recomendado");
	}
		else if (nota>=70/100	&&	nota<80/100){
		System.out.println("Recomendado");
		}
			else if (nota<10/100){
			System.out.println("Nao Recomendado");
			}
		}
	}