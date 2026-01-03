package classe;

public class ProdutoTeste {
	public static void main(String[] args){
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		
		Produto p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto p3 = new Produto("Escova", 150);
		
		Produto.desconto = 0.5;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		System.out.println(p3.nome);
		System.out.println(p3.preco);
	}
}
