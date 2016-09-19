public class Ex13{
	public static void main(String args[]){
	float a=1000,b=001;
	int mes=0;
	while (a<=1000000 && b<=1000000){
	a=a+a*10/100f;
	b=b+b*100/100f;
	mes++;
	}
	System.out.println("cliente a:	"+a);
	System.out.println("cliente b:	"+b);
	System.out.println("quantidade de mes:	"+mes);
	
	}
}
	