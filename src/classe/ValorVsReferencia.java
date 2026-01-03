package classe;

public class ValorVsReferencia {

	public static void main(String args[]){
		double a = 2;
		double b = a; // atribuição por valor(tipo primitivo)
		a++;
		b--;
		System.out.println(a + " " + b);
		
		Data d1 = new Data(16, 10, 2014);
		Data d2 = d1; //atribuição por referência(objeto)
		
		d1.dia = 24;
		d2.mes = 04;
		d1.ano = 1988;
		
		System.out.println(d1.dataFormatada() + " " + d2.dataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.dataFormatada() + " " + d2.dataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataParaValorPadrao(Data d){
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a){
		a++;
	}
}
