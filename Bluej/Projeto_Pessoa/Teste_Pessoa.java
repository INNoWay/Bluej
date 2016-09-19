	public class Teste_Pessoa{
		public static void main (String args[])
	{
	Pessoa pedro,ana;
	pedro=new Pessoa();
	ana=new Pessoa();
	
	ana.nome="ana miranda";
	pedro.nome="pedro silva";
	
	System.out.println("entre com a idade de ana");
		ana.idade=Input.readInteger();
	System.out.println("entre com a idade de pedro");
		pedro.idade=Input.readInteger();
		
	ana.fazaniversario();
	pedro.fazaniversario();
	
	System.out.println(pedro.nome+"possui");
	System.out.println(pedro.idade+"Anos");
	
	System.out.println(ana.nome+"possui");
	System.out.println(ana.idade+"Anos");
	}
}
	
