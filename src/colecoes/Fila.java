package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {//FIFO(First In First Out) - primeiro a entrar primeiro a sair

	public static void main(String args[]){
		
		Queue<String> fila = new LinkedList<>();
		
		//offer e add adicionam elementos na fila
		//diferença é o comportamento quando a fila está cheia
		//add vai retornar booleano(false ou true) e offer vai jogar uma excessao(problema) e não adiciona o elemento na fila
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//peek e element obtem o proximo elemento na fila SEM REMOVER
		//diferença é o comportamento quando a fila está vazia
		System.out.println(fila.peek());//se a fila estiver vazia retorna null
		System.out.println(fila.element());//se a fila estiver vazia lança uma excessão(problema)
		
		//remove e poll obtem o proximo elemento na fila e REMOVE
		//diferença é o comportamento quando a fila está vazia
		System.out.println(fila.poll());//retorna o primeiro elemento da fila e o remove
		System.out.println(fila.poll());//retorna e remove
		System.out.println(fila.poll());//retorna e remove
		System.out.println(fila.poll());//retorna e remove
		System.out.println(fila.poll());//retorna e remove
		System.out.println(fila.poll());//retorna e remove
		System.out.println(fila.poll());//quando está vazio retorna null
		
		System.out.println(fila.remove());//remove da fila também
		System.out.println(fila.remove());//mas quando está vazia lança uma excessão
		
		//fila.size(); -> ver tamano da fila
		//fila.clear(); -> limpar fila
		//fila.isEmpty(); -> ver se fila é vazia
		//fila.contains(...); -> pra saber se contém o elemento
		
	}
}
