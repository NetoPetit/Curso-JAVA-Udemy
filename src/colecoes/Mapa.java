package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String args[]){
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Roberto");//adiciona
		usuarios.put(1, "Paulo");//substitui
		usuarios.put(2, "Rafaela");//adiciona
		usuarios.put(3, "Rebeca");//adiciona
		
		System.out.println(usuarios.size());//mostra o tamanho que é 3, porque o numero um é substituído
		
		System.out.println(usuarios.isEmpty());//mostra se é vazio
		System.out.println(usuarios.keySet());//mostra a chave de cada indice
		System.out.println(usuarios.values());//mostra os valores de cada posição
		System.out.println(usuarios.entrySet());//mostra o valor do indice e o conteudo
		
		System.out.println(usuarios.containsKey(2));//mostra se contem o valor da chave
		System.out.println(usuarios.containsValue("Paulo"));//mostra se contem o valor dentro do array
		
		System.out.println(usuarios.get(3));//pega o valor dentro do indice 3
		System.out.println(usuarios.remove(2));//remove o valor do indice 2
		
		for(int chave: usuarios.keySet()){//percorre e exibe as chaves
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()){//percorre os valores
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()){//mostra o indice e o valor
			System.out.println(registro.getKey() + "==>");
			System.out.println(registro.getValue());
		}
	}
}
