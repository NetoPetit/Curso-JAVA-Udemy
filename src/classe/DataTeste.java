package classe;

public class DataTeste {
	public static void main(String[] args){
		
		Data data1 = new Data();
		String dataFormatada1 = data1.dataFormatada();
		
		Data data2 = new Data(16, 10, 2014);
		String dataFormatada2 = data2.dataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(dataFormatada2);
	}
}
