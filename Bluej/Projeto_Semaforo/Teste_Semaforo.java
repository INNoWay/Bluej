public class Teste_Semaforo {
	public static void main (String args[])
	{
    String resp;
	Semaforo c1,c2,c3;
	
	c1=new Semaforo();
	c2=new Semaforo();
	c3=new Semaforo();

	System.out.println("Entre Estado do primeiro sinal");
	c1.estado=Input.readString();

	c1.sinal();
	
	System.out.println("Entre Estado do seegundo sinal");
	c2.estado=Input.readString();
	
	c2.sinal();
	
	System.out.println("Entre Estado do terceiro sinal");
	c3.estado=Input.readString();
	
	c3.sinal();
	
	
		if (c1.teste){
		c2.estado="vermelho";
		c3.estado="amarello";
		}
		else if(c2.teste){
			 c1.estado="vermelho";
			 c3.estado="amarello";
			 }
			 else if(c3.teste){
				 c1.estado="vermelho";
				 c2.estado="amarello";
				 }
				
				System.out.println("semaforo1	"+c1.estado);
				System.out.println("semaforo2	"+c2.estado);
				System.out.println("semaforo3	"+c3.estado);
				
		
	}
}
