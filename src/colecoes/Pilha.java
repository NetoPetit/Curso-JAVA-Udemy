package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;



public class Pilha {//LIFO(Last In First Out) - último a entrar primeiro a sair

	public static void main(String args[]){
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.pop());//também REMOVE e lança uma excessão
		System.out.println(livros.poll());//remove e retorna null
		System.out.println(livros.poll());//remove
		System.out.println(livros.poll());//remove
		System.out.println(livros.poll());//remove e retorna null
		System.out.println(livros.pop());
		System.out.println(livros.remove());
		
		//livros.contains();
		//livros.clear();
		//livros.isEmpty();
	}
}
