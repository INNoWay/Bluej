public class Porta{
public String cor;
public float dimx;
public float dimy;
public float dimz;
private boolean aberta;
	
		public void abre(){
		aberta=true;
		}
		public void fecha(){
		aberta=false;
		}
		public void pinta(String s){
		cor=s;
		}
		public void esta_aberta(){
			if (aberta){
			System.out.println("a porta esta aberta");
			}
			else{
			System.out.println("a porta esta fechada");
			}
		}
	}
