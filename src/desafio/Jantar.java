package desafio;


public class Jantar {

	public static void main(String args[]){
		Pessoa p1 = new Pessoa("João", 88);
		Comida c1 = new Comida("Peixe", 0.200);
		Comida c2 = new Comida("Arroz", 0.300);
		
		System.out.printf("O %s tem %2.2f KG.\n", p1.nome, p1.peso);
		
		p1.comer(c1);
		
		System.out.printf("Ele comeu %s, e ficou com %2.2f KG.\n", c1.nome, p1.peso);
		
		p1.comer(c2);
		
		System.out.printf("Ele comeu %s, e ficou com %2.2f KG.\n", c2.nome, p1.peso);
		
		p1.comer(c2);
		
		System.out.printf("Ele comeu + %2.2f de %s, e ficou com %2.2f KG.\n", c2.peso, c2.nome, p1.peso);
	}
}
