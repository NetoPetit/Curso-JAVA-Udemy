package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.29;
	
	Produto(){
		
	}

	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto(){
		double descontoNoPreco = preco * (1 - (desconto));
		return descontoNoPreco;
	}
}

