public class Semaforo{
public boolean teste=false;
public String estado;
	
	public Semaforo(){
	estado="vermelho";
	}
	public void sinal(){
	if (estado.equals("verde")){
	teste=true;
	}
	}
	public void Pode_passa(){
		if (estado.equals("verde")){
		teste=true;	
		}
		else {
		teste=false;	
		}
	}
}
		
