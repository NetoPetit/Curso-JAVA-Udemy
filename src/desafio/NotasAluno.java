package desafio;

import java.util.Arrays;
import java.util.Scanner;

public class NotasAluno {

	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas voce quer inserir?\n");
		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double[qtdNotas];
		for(int i = 0; i < notas.length; i++){
			System.out.println("Digite a nota " + (i + 1) + ":");
			notas[i] = entrada.nextDouble();
		}
		
		System.out.println(Arrays.toString(notas));
		
		double soma = 0;
		for(double nota: notas){
			soma += nota;
		}
		
		double media = soma / notas.length;
		
		System.out.printf("A media do aluno e %2.2f.", media);
		
		entrada.close();
	}
}
