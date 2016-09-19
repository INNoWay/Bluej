public class Teste_Porta{
		public static void main (String args[])
	{
	String resp;
	
	Porta p1;
	p1=new Porta();
	
	System.out.println("entre a dimx");
		p1.dimx=Input.readFloat();
	System.out.println("entre a dimy");
		p1.dimy=Input.readFloat();
	System.out.println("entre a dimz");
		p1.dimz=Input.readFloat();	
	System.out.println("entre a cor da porta");
		p1.cor=Input.readString();	
	System.out.println("qual e o estado da porta");
		resp=Input.readString();	
		if (resp.equals("abre")){
		p1.abre();
		}
		else {
		p1.fecha();	
		}

	}
}
