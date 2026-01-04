package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos a turma tem?");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas cada aluno tem?");
		int qtdNotas = entrada.nextInt();
		
		double[][] notasAluno = new double[qtdAlunos][qtdNotas];
		
		double soma = 0;
		for(int a = 0; a < notasAluno.length; a++){
			System.out.println("Digite as notas do " + (a + 1) + " aluno.\n");
			
			for(int n = 0; n < notasAluno[a].length; n++){
				System.out.printf("Informe a nota %d do aluno %d:\n", (n + 1) , (a + 1));
				notasAluno[a][n] = entrada.nextDouble();
				soma += notasAluno[a][n];
			}
		}
		
		double media = soma / (qtdAlunos * qtdNotas);
		
		System.out.printf("A media da turma e %2.2f.", media);
		
		entrada.close();
	}
}
